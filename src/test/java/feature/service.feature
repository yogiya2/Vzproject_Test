
@ServiceTest

Feature: Testing service provisioning API 

Scenario Outline: POST function of service provisioning API  
Given User is on service API page1
When user wants to <method1> api service provision 
Then user can access service provision fuction

Examples:
|method1|
|"POST"|


Scenario Outline: POST  function of Orders 
Given User is on service provisioning API  page2
When user wants to <method2> api service test-qos
Then user can access the service test-qos function

Examples:
|method2|
|"POST"|

Scenario Outline: PUT  function of Orders 
Given User is on service provisioning  page3
When user wants to <method3> api service hold <connectionid> 
Then user can access the  service page

Examples:
|method3|connectionid|
|"PUT"|"1"|

Scenario Outline: PUT  function of Orders 
Given User is on  service provisioning API page4
When user wants to <method3> api service resume <connectionid> 
Then user can access the service function

Examples:
|method3|connectionid|
|"PUT"|"1"|
