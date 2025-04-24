
Feature: Lead creation

  Background:

    Given use should be on login
    When user enter valid credentials
    And click on login button
    Then user should be navigated to home page
    And user can see the logout link
  @leads
  Scenario: TC03_Create_Lead_With_Mandatory_fields
    When user clicks on new lead and fills all mandatory fields and clicks on save button
      | lastname | company |
      | Harish   | TBL     |
      | Rajesh   | ATH     |
      | Ramesh   | TGH     |
    Then lead should be created
