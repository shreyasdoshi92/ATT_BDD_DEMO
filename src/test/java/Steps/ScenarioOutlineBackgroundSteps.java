package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineBackgroundSteps {
	
	@Given("I landed on the ecommerce page")
	public void i_landed_on_the_ecommerce_page() {
	    System.out.println("I landed on the ecommerce page.");
	}
	
	@Given("^Logged in with username (.+) and password (.+)$")
	public void logged_in_with_username_and_password(String uname, String pass) {
		 System.out.println("Logged in with username : " + uname + " And Password : " + pass);
	}
	
	@When("^I add the product (.+) to the cart$")
	public void i_add_the_product_to_the_cart(String Product) {
	    System.out.println("The product added to the cart is : " +Product);
	}
	
	@When("^checkout (.+) and select the country (.+) and submit the order$")
	public void checkout_productname_and_select_the_country_and_submit_the_order(String Product, String country){
		System.out.println("Checkout " + Product + " and select the country " + country + " and submit the order.");
	}
	
	@Then("{string} message is displayed on confirmation page")
	public void message_is_displayed_on_confirmation_page(String msg) {
		System.out.println(msg + " should be displayed.");
	}
	
	@Given("Logged in with username and password")
	public void logged_in_with_username_and_password() {
		System.out.println("Logged in with username and Password");
	}
	
	@When("Go to orders page clicking on Orders")
	public void go_to_orders_page_clicking_on_orders() {
		System.out.println("Go to orders page clicking on Orders");
	}
	
	@Then("ProductName is displayed on order page")
	public void product_name_is_displayed_on_order_page() {
		System.out.println("ProductName is displayed on order page");
	}
}
