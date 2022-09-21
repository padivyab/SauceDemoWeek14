package com.demo.sauce.pages;

import com.demo.sauce.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.annotation.CheckForNull;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement username;

    @CheckForNull
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement login;

    @CacheLookup
    @FindBy(xpath = "//span[@class='title']")
    WebElement verifyProduct;

    @CacheLookup
    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement selectdropdown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    WebElement addtocart;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkout;

    @CacheLookup
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cart;

    @CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement fname;

    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lname;

    @CacheLookup
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement postalcode;

    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continuebtn;

    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finish;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='complete-header']")
    WebElement order;

    public void Enterusername()
    {
        sendTextToElement(username,"standard_user");
    }
    public void EnterPassword()
    {
        sendTextToElement(password,"secret_sauce");
    }
    public void LoginBtn()
    {
        clickOnElement(login);
    }
    public String VerifyProduct()
    {
        return getTextFromElement(verifyProduct);
    }
    public void SelectZToA()
    {
        selectByValueFromDropDown(selectdropdown,"za");
    }
    public void AddToCartP()
    {
        clickOnElement(addtocart);
    }
    public void ClickOnCheckout()
    {
        clickOnElement(checkout);
    }
    public void ClickOnCart()
    {
        clickOnElement(cart);
    }
    public void EnterFirstName()
    {
        sendTextToElement(fname,"divya");
    }
    public void EnterLastName()
    {
        sendTextToElement(lname,"patel");
    }
    public void EnterPostalCode()
    {
        sendTextToElement(postalcode,"l1g3w4");
    }
    public void ClickOnConti()
    {
        clickOnElement(continuebtn);
    }
    public void ClickOnFinish()
    {
        clickOnElement(finish);
    }
    public String VerifyOrder()
    {
        return getTextFromElement(order);
    }

}
