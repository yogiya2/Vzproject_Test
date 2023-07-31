package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ServiceDef {

@Given("User is on service API page1")
public void user_is_on_service_api_page1() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("given1");
}
@When("user wants to {string} api service provision")
public void user_wants_to_api_service_provision(String string) {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("when1");
}
@Then("user can access service provision fuction")
public void user_can_access_service_provision_fuction() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("then1");
}
@Given("User is on service provisioning API  page2")
public void user_is_on_service_provisioning_api_page2() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("given2");
}
@When("user wants to {string} api service test-qos")
public void user_wants_to_api_service_test_qos(String string) {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("when2");
}
@Then("user can access the service test-qos function")
public void user_can_access_the_service_test_qos_function() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("then2");
}
@Given("User is on service provisioning  page3")
public void user_is_on_service_provisioning_page3() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("given3");
}
@When("user wants to {string} api service hold {string}")
public void user_wants_to_api_service_hold(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("when3");
}
@Then("user can access the  service page")
public void user_can_access_the_service_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("then3");
}
@Given("User is on  service provisioning API page4")
public void user_is_on_service_provisioning_api_page4() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("given4");
}
@When("user wants to {string} api service resume {string}")
public void user_wants_to_api_service_resume(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("when4");
}
@Then("user can access the service function")
public void user_can_access_the_service_function() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("then4");
}


}
