package StepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps{
	WebDriver driver;
	 ExtentReports extent;
	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		ExtentHtmlReporter report = new ExtentHtmlReporter("./Reporter/SenExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(report);
        ExtentTest logger = extent.createTest("LoginTest");
        logger.log(Status.INFO, "Login to Senthil");
        logger.log(Status.PASS, "Verified");
        
      
		driver  = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@After
	public void tearDown(){
		System.out.println("Closing the browser");
		driver.close();
		 extent.flush();
		
	}
	@Given("^User is on Yahoo Login Page$")
	public void user_is_on_Yahoo_Login_Page() throws Throwable {
		System.out.println("Login Page is displayed");
		
	    
	}

	@When("^user submits the name$")
	public void user_submits_the_name(DataTable data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> nameData = data.raw();
		String name = nameData.get(1).get(0);
		System.out.println(name);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='signin']")).click();
		
	    
	}

	@Then("^user submits the invalid password$")
	public void user_submits_the_invalid_password(DataTable data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> passData = data.raw();
		String password = passData.get(1).get(0);
		System.out.println(password);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		Thread.sleep(4000);
	    
	}

	


}
