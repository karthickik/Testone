Feature: Login Action
 
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "<user name>" and "<password>"
	Then Message displayed Login Successfully
	
	Examples:
    | user name      | password |
    | rajeshdotlucky | versumlat1234 |
    | rajeshdotlucky    | versumlat1234 |
 
Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully
	
	