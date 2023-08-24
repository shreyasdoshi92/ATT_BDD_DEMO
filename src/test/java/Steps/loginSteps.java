package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {

	@Given("User is at login page")
	public void user_is_at_login_page() {
		System.out.println("Pre conditions got executed");
	}
	
	@When("User enters the username")
	public void user_enters_the_username()
	{
		System.out.println("Entering username");
	}
	
	@When("User enters the password")
	public void user_enters_the_password()
	{
		System.out.println("Entering password");
	}
	
	
	@When("User clicks on login button")
	public void user_clicks_on_login_button()
	{
		System.out.println("Clicking on login button");
	}
	
	@Then("User redirects to home page")
	public void user_redirects_to_home_page()
	{
		System.out.println("Validation of login");
		System.out.println("Yes");
	}
	
	@Then("Verify title of the landing page")
	public void verify_title_of_the_landing_page() {
		System.out.println("Validation of landing page title");
	}
}
