@AllLinks
Feature: Validate links on Google Home Page
  Background:
    Given Open "https://google.com"

  @SmokeTest
    Scenario: Test About Link
      When Click on About Link
      Then About Page should open

  @StoreLink
    Scenario: Test Store Link
      When Click on Store Link
      Then Store Page should open

  @GmailTest
    Scenario: Test Gmail Link
      When Click on Gmail Link
      Then Gmail Page should open

  @ImagesTest
    Scenario: Test Images Link
      When Click on Images Link
      Then Images Page should open