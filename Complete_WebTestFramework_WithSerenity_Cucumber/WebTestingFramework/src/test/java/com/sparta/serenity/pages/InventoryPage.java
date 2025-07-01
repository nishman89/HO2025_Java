package com.sparta.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;

@DefaultUrl("https://www.saucedemo.com/")
public class InventoryPage extends PageObject {

    @FindBy(className = "inventory_item")
    private List<WebElementFacade> inventoryItems;

    @FindBy(css = ".shopping_cart_badge")
    private WebElementFacade cartBadge;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElementFacade addBackpackButton;

    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElementFacade removeBackpackButton;

    @FindBy(id = "react-burger-menu-btn")
    private WebElementFacade menuButton;

    @FindBy(id = "logout_sidebar_link")
    private WebElementFacade logoutLink;

    public int getInventoryItemCount() {
        return inventoryItems.size();
    }

    public void addFirstItemToCart() {
        addBackpackButton.click();
    }

    public String getCartBadgeText() {
        return cartBadge.getText();
    }

    public void removeFirstItemFromCart() {
        removeBackpackButton.click();
    }

    public boolean isCartBadgeDisplayed() {
        return cartBadge.isCurrentlyVisible();
    }

    public void openMenu() {
        menuButton.click();
    }

    public void clickLogout() {
        logoutLink.click();
    }
}
