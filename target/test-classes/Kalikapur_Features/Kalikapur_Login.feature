Feature: This a Login Feature


@Ripon
Scenario: Verify User can Login Successfully

Given Launch<"URL">Kal
Then Click KalLogin
Then Type username password click Login
Then Verify User can Login Successfully
Then Logout the site
