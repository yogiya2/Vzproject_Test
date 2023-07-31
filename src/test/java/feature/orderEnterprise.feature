
@EnterpriseOrdersTest

Feature: Testing ordering API for enterprise

Scenario Outline: GET and POST functions of ordering API  
Given User is on enterpriseOrders API page1
When user wants to <method1> api enterprise customers <customerid> orders 
Then user can access the orders of enterprise customers functions

Examples:
|method1|id|
|"GET"|"1"|
|"POST"|"2"|


Scenario Outline: GET  function of Orders 
Given User is on enterpriseOrders API page2
When user wants to <method2> api enterprise orders <orderid> 
Then user can access the order functions

Examples:
|method2|orderid|
|"GET"|"1"|

Scenario Outline: PUT  function of Orders 
Given User is on enterpriseOrders API page3
When user wants to <method3> api enterprise customers <customerid>  orders <orderid> 
Then user can access the orders of enterprise function

Examples:
|method3|"customerid"|orderid|
|"PUT"|"1"|"6"|


