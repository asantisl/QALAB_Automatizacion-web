package com.nttdata.steps;

import com.nttdata.page.CartPage;
import com.nttdata.page.InventoryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartSteps {
    private WebDriver driver;

    public CartSteps(WebDriver driver) {
        this.driver = driver;
    }
    public int getCartSize() {
        List<WebElement> items = this.driver.findElements(CartPage.itemsCards);
        return items.size();
    }
    public String getTitle() {
        return this.driver.findElement(CartPage.productsTitle).getText();
    }
}
