package com.sparta.serenity.steps;

import com.sparta.serenity.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


public class InventorySteps {

    @Managed
    InventoryPage inventoryPage;
    @Then("The number of products displayed on the inventory page is {int}")
    public void theNumberOfProductsDisplayedOnTheInventoryPageIs(int expected) {
        assertThat(inventoryPage.getInventoryItemCount(), is(expected));
    }

    @When("I add an item to the cart")
    public void iAddAnItemToTheCart() {
        inventoryPage.addFirstItemToCart();
    }

    @Then("The item count increases by one")
    public void theItemCountIncreasesByOne() {
        assertThat(inventoryPage.getCartBadgeText(), is("1"));
    }
}
