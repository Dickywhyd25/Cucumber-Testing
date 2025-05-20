package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTest {

    private static WebDriver driver;
    private static LoginPage loginPage = new LoginPage();

    public LoginTest(){
        driver = Hooks.driver;
    }

    // TCC.HR.001
    @Given("I am on the login page")
    public void i_am_on_the_login_page(){
        driver.get(Constants.URL);
    }

    @When("I enter a valid username and password")
    public void i_enter_a_valid_username_and_password(){
        loginPage.loginUsernamePassword();
    }

    @And("I click the login button")
    public void i_click_the_login_button(){
        loginPage.setLoginBtn();
    }

    @Then("I should be redirected to dashboard page")
    public void i_should_be_redirected_to_dashboard_page(){
        Assert.assertEquals(loginPage.getTxtDashboard(),"Dashboard");
    }

}
