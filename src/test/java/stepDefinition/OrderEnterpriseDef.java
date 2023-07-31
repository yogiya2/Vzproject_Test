package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderEnterpriseDef {
	@Given("User is on enterpriseOrders API page1")
	public void user_is_on_enterprise_orders_api_page1() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("given1");}
	@When("user wants to {string} api enterprise customers <customerid> orders")
	public void user_wants_to_api_enterprise_customers_customerid_orders(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when1");
	}
	@Then("user can access the orders of enterprise customers functions")
	public void user_can_access_the_orders_of_enterprise_customers_functions() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then1");}
	@Given("User is on enterpriseOrders API page2")
	public void user_is_on_enterprise_orders_api_page2() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("given2");}
	
	@When("user wants to {string} api enterprise orders {string}")
	public void user_wants_to_api_enterprise_orders(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when2");}
	
	@Then("user can access the order functions")
	public void user_can_access_the_order_functions() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then2");
		}
	@Given("User is on enterpriseOrders API page3")
	public void user_is_on_enterprise_orders_api_page3() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("given3");
	}
	@When("user wants to {string} api enterprise customers <customerid>  orders {string}")
	public void user_wants_to_api_enterprise_customers_customerid_orders(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when3");
	}
	@Then("user can access the orders of enterprise function")
	public void user_can_access_the_orders_of_enterprise_function() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then3");
	}
	
	}


