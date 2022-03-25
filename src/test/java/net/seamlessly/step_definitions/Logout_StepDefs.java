package net.seamlessly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.seamlessly.pages.LoginPage;
import net.seamlessly.pages.LogoutPage;
import net.seamlessly.utilities.ConfigurationReader;
import net.seamlessly.utilities.Driver;

public class Logout_StepDefs {
    LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login();
    }

    @When("the user clicks the avatar icon")
    public void the_user_clicks_the_avatar_icon() {
        logoutPage.profileIcon.click();
    }

    @When("the user clicks the logout label")
    public void the_user_clicks_the_logout_label() {
        logoutPage.logoutLink.click();
    }
}
