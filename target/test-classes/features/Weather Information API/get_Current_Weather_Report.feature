Feature: Get the current Weather Report

  @Current_Weather_Report
  Scenario: Current Weather Report API is hit with valid URI
    Given the URI for Current Weather Report
    When Current Weather API-URI is hit
    Then Api should Return Statuscode <200>


