
Feature: Checkout page Text

  Scenario: A user can see checkout page text
    Given a user is on the landing page
    When he type the location and clicks 1st location
    And he click 1st restaurant under Top restaurant chains in Hyderabad
    And he clicks add button on first listed dish
    And hover over the cart icon in right top corner
    And he clicks Checkout button
    Then verify the text "To place your order now, log in to your existing account or sign up."