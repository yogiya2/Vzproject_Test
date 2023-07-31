
@EnterpriseTest

Feature: Testing  API for enterprise customer

Scenario Outline: GET and POST functions of enterprise customer  
Given User is on enterprise API page1
When user wants to <method1> api enterprise customers  
Then user can access the enterprise customer details

Examples:
|method1|
|"GET"|
|"POST"|




Scenario Outline: GET and PUT functions of enterprise customer  
Given User is on enterprise API page2
When user wants to <method2> api enterprise customers <customerid> 
Then user can access the enterprise customer detail 

Examples:
|method2|customerid|
|"GET"|"1"|
|"PUT"|"2"|


