@catalogTest

Feature: Testing Catalog API

Scenario Outline: GET and POST functions of Catalog  
Given User is on Catalog API page1
When user wants to <method1> api catalog 
Then user can access the catalog

Examples:
|method1|
|"GET"|
|"POST"|


Scenario Outline: PUT and DELETE functions of Catalog  
Given User is on Catalog API page2
When user wants to <method2> api catalog <id> 
Then user can access the catalog functions

Examples:
|method2|id|
|"PUT"|"1"|
|"DELETE"|"2"|