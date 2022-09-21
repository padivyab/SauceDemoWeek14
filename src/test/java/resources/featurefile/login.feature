Feature: Login Functionality

  As a user I want to login in sauce

  Scenario: login with valid credential

    Given  I am on homepage
    When   I enter username "username"
    And    I enter password "password"
    And    I click on login button
    And    I verify "PRODUCTS"
    And    I click on Z to A
    And    I click on add to cart
    And    I click on cart
    And    I click on checkout
    And    I enter firstname
    And    I enter lastname
    And    I enter postalcod
    And    I click on continue
    And    I click on finish
    Then   I Verify order "THANK YOU FOR YOUR ORDER"
