package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CatalogDef {
	@Given("User is on Catalog API page1")
	public void user_is_on_catalog_api_page1() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("given1");
	}
	@When("user wants to {string} api catalog")
	public void user_wants_to_api_catalog(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when1");
	}
	@Then("user can access the catalog")
	public void user_can_access_the_catalog() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then1");
	}
	@Given("User is on Catalog API page2")
	public void user_is_on_catalog_api_page2() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("given2");
	}
	@When("user wants to {string} api catalog {string}")
	public void user_wants_to_api_catalog(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when2");
	}
	@Then("user can access the catalog functions")
	public void user_can_access_the_catalog_functions() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then2");


}}
