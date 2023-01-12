@ProductDetail
Feature: Product Detail Scenarios
  This cases is for Product feature which is every case will started with Background first.

  Background: User already login
    Given user launch the Sauce Demo app
    Then Sauce Demo app will displayed
    When user input username "standard_user"
    And user input password "secret_sauce"
    And user click Login button
    Then user redirected to "PRODUCTS" page

  @TC004
  Scenario: TC004 - User want to see detail a product
    And user click on "Sauce Labs Onesie"
    Then user redirected to "BACK TO PRODUCTS" page
    Then  user read product "Sauce Labs Onesie" detail is appear