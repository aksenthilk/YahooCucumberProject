$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("G:/SeleniumCucumberWorkSpace/Yahoo/src/main/java/FeatureFile/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Yahoo Login",
  "description": "",
  "id": "yahoo-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10006953865,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Validate Invalid Password",
  "description": "",
  "id": "yahoo-login;validate-invalid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on Yahoo Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user submits the name",
  "rows": [
    {
      "cells": [
        "useryahooemailid"
      ],
      "line": 5
    },
    {
      "cells": [
        "aksenthil2002@yahoo.co.in"
      ],
      "line": 6
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user submits the invalid password",
  "rows": [
    {
      "cells": [
        "invalidpassword"
      ],
      "line": 8
    },
    {
      "cells": [
        "aksenthilk"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_is_on_Yahoo_Login_Page()"
});
formatter.result({
  "duration": 222765234,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_submits_the_name(DataTable)"
});
formatter.result({
  "duration": 694577879,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_submits_the_invalid_password(DataTable)"
});
formatter.result({
  "duration": 9573579137,
  "status": "passed"
});
formatter.after({
  "duration": 3072652779,
  "status": "passed"
});
});