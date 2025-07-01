package com.sparta.selenium;


import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class SwagLabTests {
    private static final String DRIVER_LOCATION = "src/test/resources/chromedriver";
    private static final String BASE_URL = "https://www.saucedemo.com/";
    private WebDriver webDriver;
    private static ChromeDriverService service;

    public static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        // options.addArguments("--headless");
        // Implict wait is set once in our options
        // Waits up to the specified time for elements to appear
        // And if the elements appear before this time, it doesn't wait the full time
        options.setImplicitWaitTimeout(Duration.ofSeconds(20));
        options.addArguments("--remote-allow-origins=*");
        return options;
    }

    @BeforeAll
    public static void beforeAll() throws IOException {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(DRIVER_LOCATION))
                .usingAnyFreePort()
                .build();
        service.start();
    }

    @AfterEach
    public void afterEach() {
        webDriver.quit();
    }
    @AfterAll
    static void afterAll() {
        service.stop();
    }

    @BeforeEach
    public void setup() {
        webDriver = new RemoteWebDriver(service.getUrl(), getChromeOptions());
    }

    @Test
    @DisplayName("Check that the webdriver works")
    public void checkWebDriver() {
        webDriver.get(BASE_URL);
        Assertions.assertEquals(BASE_URL, webDriver.getCurrentUrl());
        Assertions.assertEquals("Swag Labs", webDriver.getTitle());
    }

    @Test
    @DisplayName("Given I enter a valid username and password, when I click login, then I should land on the inventory page")
    public void succesfulLogingTest(){

        // Arrange (given)
        webDriver.get(BASE_URL);
        WebElement usernameField = webDriver.findElement(By.name("user-name"));
        WebElement passwordField = webDriver.findElement(By.name("password"));
        WebElement loginButton = webDriver.findElement(By.id("login-button"));
        //Act (when)
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
        assertThat(webDriver.getCurrentUrl(), is(BASE_URL + "inventory.html"));

    }

    @Test
    @DisplayName("Given I am logged in, when I view the inventory page, then I should see the correct number of products")
    public void checkNumberOfProductsOnInventoryPage(){
        webDriver.get(BASE_URL);
        WebElement usernameField = webDriver.findElement(By.name("user-name"));
        WebElement passwordField = webDriver.findElement(By.name("password"));
        WebElement loginButton = webDriver.findElement(By.id("login-button"));
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

        // A list of all webelements where it has the class="inventory-item" attribute
        List<WebElement> products = webDriver.findElements(By.className("inventory_item"));
        for (WebElement w : products){
            System.out.println(w.getText());
        }

        int productCount = products.size();
        assertThat(productCount, is(6));

    }

    @Test
    @DisplayName("Given I enter a valid username and an invalid password, when I click login, then I should see an error message containing 'Epic sadface'")
    public void unsuccessfulLoginTest_InvalidPassword(){
        webDriver.get(BASE_URL);
        WebElement usernameField= webDriver.findElement(By.name("user-name"));
        WebElement passwordField= webDriver.findElement(By.name("password"));
        WebElement loginButton= webDriver.findElement(By.id("login-button"));
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("invalid");
        loginButton.click();
        WebElement alert = webDriver.findElement(By.className("error-message-container"));
        MatcherAssert.assertThat(alert.getText(), containsString("Epic sadface"));
    }

    // Ecplit wait specfies a specfic condition that must be true before contuing with the next command
    @Test
    @DisplayName("Given I am logged in, when I view the inventory page, then I should see the correct number of products (with wait)")
    public void checkNumberOfProductsOnInventoryPage_withWait(){
        Wait<WebDriver> wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));


        webDriver.get(BASE_URL);
        WebElement usernameField = webDriver.findElement(By.name("user-name"));
        WebElement passwordField = webDriver.findElement(By.name("password"));
        WebElement loginButton = webDriver.findElement(By.id("login-button"));
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

        // A list of all webelements where it has the class="inventory-item" attribute
        wait.until(driver -> webDriver.getCurrentUrl().contains("/inventory"));
        List<WebElement> products = webDriver.findElements(By.className("inventory_item"));
        for (WebElement w : products){
            System.out.println(w.getText());
        }

        int productCount = products.size();
        assertThat(productCount, is(6));

    }

}