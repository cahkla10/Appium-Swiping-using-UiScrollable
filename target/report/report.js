$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ProductDetail.feature");
formatter.feature({
  "line": 2,
  "name": "Product Detail Scenarios",
  "description": "This cases is for Product feature which is every case will started with Background first.",
  "id": "product-detail-scenarios",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ProductDetail"
    }
  ]
});
formatter.before({
  "duration": 17140323500,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "User already login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user launch the Sauce Demo app",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Sauce Demo app will displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user input username \"standard_user\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user input password \"secret_sauce\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user redirected to \"PRODUCTS\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundStep.userLaunchTheSauceDemoApp()"
});
formatter.result({
  "duration": 257284000,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundStep.sauceDemoAppWillDisplayed()"
});
formatter.result({
  "duration": 2251073300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 21
    }
  ],
  "location": "LoginStep.userInputUsername(String)"
});
formatter.result({
  "duration": 2058187400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 21
    }
  ],
  "location": "LoginStep.userInputPassword(String)"
});
formatter.result({
  "duration": 1239316700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.userClickLoginButton()"
});
formatter.result({
  "duration": 600760500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PRODUCTS",
      "offset": 20
    }
  ],
  "location": "CommonStep.userRedirectedTo(String)"
});
formatter.result({
  "duration": 1952497700,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "TC004 - User want to see detail a product",
  "description": "",
  "id": "product-detail-scenarios;tc004---user-want-to-see-detail-a-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@TC004"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user click on \"Sauce Labs Onesie\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user redirected to \"BACK TO PRODUCTS\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user read product \"Sauce Labs Onesie\" detail is appear",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sauce Labs Onesie",
      "offset": 15
    }
  ],
  "location": "ProductStep.userClickOn(String)"
});
formatter.result({
  "duration": 9070191200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BACK TO PRODUCTS",
      "offset": 20
    }
  ],
  "location": "CommonStep.userRedirectedTo(String)"
});
formatter.result({
  "duration": 1735401100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sauce Labs Onesie",
      "offset": 19
    }
  ],
  "location": "ProductDetailStep.userReadProduct(String)"
});
formatter.result({
  "duration": 380215000,
  "status": "passed"
});
formatter.after({
  "duration": 1116649700,
  "status": "passed"
});
});