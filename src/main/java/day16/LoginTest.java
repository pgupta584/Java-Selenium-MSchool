package day16;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	
    @Given("the user is on the login page")
	public void loginPage() {
		System.out.println("User is at Login Page");
	}
	
    @When("the user enters a valid username and password")
	public void enterUserNamePassword() {
		System.out.println("User Enter Username and Password");

	}
	
    @And("the user clicks on submit button")
	public void clickOnLoginButton() {
		System.out.println("User click on Login Button");

	}
	
    @Then("the user should be logged in successfully")
	public void verifyLogin() {
		System.out.println("User is able to Login");

	}
	

}
