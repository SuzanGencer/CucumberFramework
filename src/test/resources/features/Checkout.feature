@checkout

Feature: Checkout
  # Background: If we have a long setup or given before the test, we are breaking this given or setup operations into Background
  Background:
  #  Given I login to web page
  #  And I bought 3 item
  #  And I will pay it with Debit Card...
    Given user is actually successfully login


    Scenario Outline: Order checkout
      When I click on item with name "<Item>"
      And I click on the ADD to CART button
      And I click on the SHOPPING CART button
      And I click on the CHECKOUT button
      And I enter the order information as "<Firstname>", "<Lastname>" and "<Zip>"
      And I click on continue button
      Then Item name mathces that of "<Item>"

      Examples:
      |Item                     | Firstname | Lastname  |  Zip  |
      |Sauce Labs Bike Light    | test      | test      | 1234  |
      |Sauce Labs Backpack      | test2     | test2     | 123452|
      |Sauce Labs Fleece Jacket | test3     | test3     | 123453|