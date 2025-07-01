package com.sparta.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/")
public class HomePage extends PageObject {

    @FindBy(name = "user-name")
    private WebElementFacade userNameField;

    @FindBy(name = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "login-button")
    private WebElementFacade loginButton;

    @FindBy(className = "error-message-container")
    private WebElementFacade errorMessage;

    public void enterUserName(String username) {
        userNameField.type(username);
    }

    public void enterPassword(String password) {
        passwordField.type(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public boolean isErrorMessageDisplayed() {
        return errorMessage.isDisplayed();
    }
    public boolean isUserNameFieldDisplayed() {
        return userNameField.isDisplayed();
    }

}
