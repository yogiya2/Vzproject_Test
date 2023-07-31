
@OrderConTest

Feature: Testing ordering API for consumer

Scenario Outline: GET and POST functions of ordering API  
Given User is on Ordering API page1
When user wants to <method1> api consumer customers <id> orders 
Then user can access method1

Examples:
|method1|id|
|"GET"|"1"|
|"POST"|"2"|


Scenario Outline: GET  function of Orders 
Given User is on ordering API page2
When user wants to <method2> api consumer orders <orderid> 
Then user can access the order1 function

Examples:
|method2|orderid|
|"GET"|"1"|

Scenario Outline: PUT  function of Orders 
Given User is on ordering API page3
When user wants to <method3> api consumer customers <customerid> orders <orderid> 
Then user can access the order2 function

Examples:
|method3|orderid|
|"PUT"|"1"|

Scenario Outline: GET  function of Orders 
Given User is on ordering API page4
When user wants to <method4> api consumer orders status <orderid> 
Then user can access the order3 function

Examples:
|method4|orderid|
|"GET"|"1"|
