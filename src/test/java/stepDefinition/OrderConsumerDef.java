package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderConsumerDef {
	@Given("User is on Ordering API page1")
	public void user_is_on_ordering_api_page1() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("given1");
	}
	@When("user wants to {string} api consumer customers {string} orders")
	public void user_wants_to_api_consumer_customers_orders(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when1");
	}
	@Then("user can access method1")
	public void user_can_access_method1() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then1");
	}
	@Given("User is on ordering API page2")
	public void user_is_on_ordering_api_page2() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("given2");	}
	@When("user wants to {string} api consumer orders {string}")
	public void user_wants_to_api_consumer_orders(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when2");	}
	@Then("user can access the order1 function")
	public void user_can_access_the_order1_function() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then2");	}
	@Given("User is on ordering API page3")
	public void user_is_on_ordering_api_page3() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("given3");
	}
	@When("user wants to {string} api consumer customers <customerid> orders {string}")
	public void user_wants_to_api_consumer_customers_customerid_orders(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when3");	}
	@Then("user can access the order2 function")
	public void user_can_access_the_order2_function() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then3");	}
	@Given("User is on ordering API page4")
	public void user_is_on_ordering_api_page4() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("given4");	}
	@When("user wants to {string} api consumer orders status {string}")
	public void user_wants_to_api_consumer_orders_status(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when4");	}
	@Then("user can access the order3 function")
	public void user_can_access_the_order3_function() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then4");	}



}
