package com.demo.sauce.steps;

import com.demo.sauce.Hooks;
import com.demo.sauce.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.apache.commons.logging.Log;
import org.testng.Assert;

public class loginsteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }


    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String user)
    {
        new LoginPage().Enterusername();
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String pass)
    {
        new LoginPage().EnterPassword();
    }

    @Then("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().LoginBtn();
    }

    @Then("^I verify \"([^\"]*)\"$")
    public void iVerify(String product)
    {
        Assert.assertEquals(product,new LoginPage().VerifyProduct());
    }

    @And("^I click on Z to A$")
    public void iClickOnZToA() throws InterruptedException {
        new LoginPage().SelectZToA();
        Thread.sleep(1000);
    }

    @And("^I click on add to cart$")
    public void iClickOnAddToCart() throws InterruptedException {
        new LoginPage().AddToCartP();
        Thread.sleep(1000);
    }

    @And("^I click on checkout$")
    public void iClickOnCheckout() throws InterruptedException {
        new LoginPage().ClickOnCheckout();
        Thread.sleep(1000);
    }

    @And("^I click on cart$")
    public void iClickOnCart() throws InterruptedException {
        new LoginPage().ClickOnCart();
        Thread.sleep(1000);
    }

    @And("^I enter firstname$")
    public void iEnterFirstname() throws InterruptedException {
        new LoginPage().EnterFirstName();
        Thread.sleep(1000);
    }

    @And("^I enter lastname$")
    public void iEnterLastname() throws InterruptedException {
        new LoginPage().EnterLastName();
        Thread.sleep(1000);
    }

    @And("^I enter postalcod$")
    public void iEnterPostalcod() throws InterruptedException {
        new LoginPage().EnterPostalCode();
        Thread.sleep(1000);
    }

    @And("^I click on continue$")
    public void iClickOnContinue() throws InterruptedException {
        new LoginPage().ClickOnConti();
        Thread.sleep(1000);
    }

    @And("^I click on finish$")
    public void iClickOnFinish() throws InterruptedException {
        new LoginPage().ClickOnFinish();
        Thread.sleep(1000);
    }


    @Then("^I Verify order \"([^\"]*)\"$")
    public void iVerifyOrder(String orderplace)
    {
        Assert.assertEquals(orderplace,new LoginPage().VerifyOrder());
    }
}
