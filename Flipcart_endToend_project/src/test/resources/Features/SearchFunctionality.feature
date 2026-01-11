Feature: To validate the flipkart application

Background:
  Given launch the flipkart application
  When close the popup
  Then it should navigate to home page

Scenario: To validate the search functionality
  Given user enter the text in the search field
  When click the search field
  Then it should be navigate to the search result page and display the relevant details
