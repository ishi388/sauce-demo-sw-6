package com.saucedemo.pages;

import com.saucedemo.Utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class ProductPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[@class='title']")
    WebElement productMessage;


    By listOfProduct = By.xpath("//div[@class='inventory_item']");


    /**
     * This method is used to get the title of homepage
     *
     * @return
     */
    public String getProductMessage() {
        Reporter.log("Get product Text " + productMessage.toString());// ReportNG
        return getTextFromElement(productMessage);
    }

    /**
     * This method is used to get the list of product
     *
     * @return
     */
    public int getNumberofProductOnHomePage() {
        Reporter.log("Get list of product " + listOfProduct.toString());
        List<WebElement> totalproduct = driver.findElements(listOfProduct);
        return totalproduct.size();
    }
}
