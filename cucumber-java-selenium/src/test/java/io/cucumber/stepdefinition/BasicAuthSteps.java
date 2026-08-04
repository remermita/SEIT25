package io.cucumber.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.pageobject.BasicAuth;
import io.cucumber.utils.Context;
import io.cucumber.utils.Manager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class BasicAuthSteps extends Context {
    WebDriver driver = manager.getDriver();
    BasicAuth basicAuth = new BasicAuth((ChromeDriver) driver);

    public BasicAuthSteps(Manager manager) {
        super(manager);
    }

    @When("the 'Basic Auth' example is clicked and opened")
    public void clickBasicAuthLink() throws InterruptedException {
        WebElement link = driver.findElement(By.xpath("//*[@id='content']/ul/li[3]/a"));
        link.click();
        Thread.sleep(3000);
        driver.get("https://the-internet.herokuapp.com/basic_auth");
    }

    @And("valid credentials are entered")
    public void typeUserPass() throws AWTException {
        Robot robot = new Robot();
        basicAuth.typeString(robot, "admin");
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        basicAuth.typeString(robot, "admin");
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        System.out.println(driver.getCurrentUrl());
    }

    @Then("Congratulations text should be displayed")
    public void validateAccess() {
        WebElement congratsText = driver.findElement(By.xpath("//*[@id='content']/div/p"));
        Assert.assertTrue(congratsText.getText(), true);
        System.out.println(congratsText.getText());
    }
}
