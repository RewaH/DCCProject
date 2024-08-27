@smoke
Feature: feature to test a functionality of selectItem as a login user

  Scenario: Check if a login user can move forword and select item from men clothes category
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to Account page
    Then user click on clothes
    Then user navigated to Clothes Page
    Then user select men category
    Then user select Black Tshirt
