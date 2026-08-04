package io.cucumber.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.utils.Context;
import io.cucumber.utils.Manager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Navigation extends Context {

  public Navigation(Manager manager) {
    super(manager);
  }

  @Given("^the page under test is '(.+)'$")
  public void navToPage(String url) {
    manager.getDriver().get(url);
    stash("exampleKey1", "exampleValue1");
  }

  @When("^I click '(.+)'$")
  public void clickLink(String directLink) {
    String xpath = "//*[@id='content']//a[text() = '" + directLink + "']";
    WebElement link = manager.getDriver().findElement(By.xpath(xpath));

    link.click();
  }

}