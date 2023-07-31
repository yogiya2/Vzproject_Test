package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EnterpriseDef {
	@Given("User is on enterprise API page1")
	public void user_is_on_enterprise_api_page1() {
	    // Write code here that turns the phrase above into concrete actions
			System.out.println("given1");
			}
	@When("user wants to {string} api enterprise customers")
	public void user_wants_to_api_enterprise_customers(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when1");
	}
	@Then("user can access the enterprise customer details")
	public void user_can_access_the_enterprise_customer_details() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then1");
	}

	@Given("User is on enterprise API page2")
	public void user_is_on_enterprise_api_page2() {
    // Write code here that turns the phrase above into concrete actions
		System.out.println("given2");
}
	@When("user wants to {string} api enterprise customers {string}")
	public void user_wants_to_api_enterprise_customers(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
		System.out.println("when2");
}
	@Then("user can access the enterprise customer detail")
	public void user_can_access_the_enterprise_customer_detail() {
    // Write code here that turns the phrase above into concrete actions
		System.out.println("then2");
}



}
