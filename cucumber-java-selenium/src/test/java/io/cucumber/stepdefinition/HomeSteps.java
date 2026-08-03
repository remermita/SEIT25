package io.cucumber.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.pageobject.Home;
import io.cucumber.utils.Context;
import io.cucumber.utils.Manager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeSteps extends Context {
  WebDriver driver = manager.getDriver();
  Home home = new Home((ChromeDriver) driver);
  List<String> linkTexts = new ArrayList<>();
  List<String> expectedList = Arrays.asList(
    "A/B Testing",
    "Add/Remove Elements",
    "Basic Auth (user and pass: admin)",
    "Broken Images",
    "Challenging DOM",
    "Context Menu",
    "Digest Authentication (user and pass: admin)",
    "Disappearing Elements",
    "Drag and Drop",
    "Dropdown",
    "Dynamic Content",
    "Dynamic Controls",
    "Dynamic Loading",
    "Entry Ad",
    "Exit Intent",
    "File Download",
    "File Upload",
    "Floating Menu",
    "Forgot Password",
    "Form Authentication",
    "Geolocation",
    "Horizontal Slider",
    "Infinite Scroll",
    "Inputs",
    "JavaScript Alerts",
    "JavaScript onload event error",
    "Key Presses",
    "Large & Deep DOM",
    "Multiple Windows",
    "Nested Frames",
    "Notification Messages",
    "Redirect Link",
    "Secure File Download",
    "Shadow DOM",
    "Shifting Content",
    "Slow Resources",
    "Sortable Data Tables",
    "Status Codes",
    "Typos",
    "WYSIWYG Editor"
  );

  public HomeSteps(Manager manager) {
    super(manager);
  }

  @And("the user views the list of links")
    public void viewListOfLinks() {
      List<WebElement> allLinks = home.getExampleLinks();
      System.out.println(allLinks.size());
      for (WebElement link : allLinks) {
        String webLink = link.getText();
        linkTexts.add(webLink);
    }
    System.out.println(linkTexts);
  }

  @Then("the expected list should contain only the following")
    public void verifyListOfLinks() {
      System.out.println(expectedList.size());
      System.out.println("Expected Links" + expectedList);
      System.out.println(linkTexts.size());
      System.out.println("Actual Links" + linkTexts);
  }
}