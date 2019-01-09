$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ContactUs.feature");
formatter.feature({
  "line": 1,
  "name": "Submit data to webdriveruniversity.com using contact us form",
  "description": "",
  "id": "submit-data-to-webdriveruniversity.com-using-contact-us-form",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1423526389,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Submit valid data using contact us form",
  "description": "",
  "id": "submit-data-to-webdriveruniversity.com-using-contact-us-form;submit-valid-data-using-contact-us-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User navigates to contact us form",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter valid firstname",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enter valid lastname",
  "rows": [
    {
      "cells": [
        "Woods",
        "Jackson",
        "Krishnaswamy"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enter email valid email address",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enter valid comments",
  "rows": [
    {
      "cells": [
        "example comment one",
        "example comment two"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the information should successfully be submitted",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsSteps.user_navigates_to_contact_us_form()"
});
formatter.result({
  "duration": 834241400,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_enter_valid_firstname()"
});
formatter.result({
  "duration": 154933724,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_enter_valid_lastname(DataTable)"
});
formatter.result({
  "duration": 125479823,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_enter_email_valid_email_address()"
});
formatter.result({
  "duration": 154681407,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.user_enter_valid_comments(DataTable)"
});
formatter.result({
  "duration": 135097795,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.User_click_on_submit_button()"
});
formatter.result({
  "duration": 1601752076,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.the_information_should_successfully_be_submitted()"
});
formatter.result({
  "duration": 41717886,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...nkyouforyourmessage![2]\u003e but was:\u003c...nkyouforyourmessage![]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat CucumberFramework.pageObjects.ContactUs_Page.confirmSubmit(ContactUs_Page.java:60)\n\tat CucumberFramework.Steps.ContactUsSteps.the_information_should_successfully_be_submitted(ContactUsSteps.java:49)\n\tat ✽.Then the information should successfully be submitted(ContactUs.feature:13)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 975385388,
  "status": "passed"
});
formatter.uri("Products.feature");
formatter.feature({
  "line": 1,
  "name": "Products page",
  "description": "",
  "id": "products-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "validate promo code alert is visible when clicking on the special offers link",
  "description": "",
  "id": "products-page;validate-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User naviagates \"\u003curl\u003e\" website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on the product \"\u003cbutton\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should be presented with a promo alert",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "products-page;validate-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link;",
  "rows": [
    {
      "cells": [
        "url",
        "button"
      ],
      "line": 9,
      "id": "products-page;validate-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link;;1"
    },
    {
      "cells": [
        "http://www.webdriveruniversity.com/Page-Object-Model/products.html",
        "#container-special-offers"
      ],
      "line": 10,
      "id": "products-page;validate-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 982641856,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "validate promo code alert is visible when clicking on the special offers link",
  "description": "",
  "id": "products-page;validate-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User naviagates \"http://www.webdriveruniversity.com/Page-Object-Model/products.html\" website",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on the product \"#container-special-offers\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should be presented with a promo alert",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.webdriveruniversity.com/Page-Object-Model/products.html",
      "offset": 17
    }
  ],
  "location": "ProductSteps.user_naviagates_website(String)"
});
formatter.result({
  "duration": 1347439316,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "#container-special-offers",
      "offset": 27
    }
  ],
  "location": "ProductSteps.user_click_on_the_products(String)"
});
formatter.result({
  "duration": 3072939082,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.user_should_be_presented_with_a_promo_alert()"
});
formatter.result({
  "duration": 1033579149,
  "status": "passed"
});
formatter.after({
  "duration": 85950048,
  "status": "passed"
});
});