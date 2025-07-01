package com.sparta.serenity.steps;

import com.sparta.serenity.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class LoginSteps {
    @Managed
    HomePage homePage;

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        homePage.open();
    }

    @And("I have entered the username {string}")
    public void iHaveEnteredTheUsername(String username) {
        homePage.enterUserName(username);
    }

    @And("I have entered the password {string}")
    public void iHaveEnteredThePassword(String password) {
        homePage.enterPassword(password);
    }

    @When("I click the login button")
    public void iClickTheLoginButton() {
        homePage.clickLoginButton();
    }

    @Then("I should land on the inventory page")
    public void iShouldLandOnTheInventoryPage() {
        assertThat(homePage.getDriver().getCurrentUrl(), is("https://www.saucedemo.com/inventory.html"));
    }

    @Then("I should see an error message that contains {string}")
    public void iShouldSeeAnErrorMessageThatContains(String expected) {
        assertThat(homePage.getErrorMessage(), containsString(expected));
    }
}
