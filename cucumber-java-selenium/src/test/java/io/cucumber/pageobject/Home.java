package io.cucumber.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Collections;
import java.util.List;

public class Home extends Page {

  public Home(ChromeDriver driver) {
    super(driver);
    System.out.println("Homepage title is : " + getTitle().getText());
  }

  @FindBy(css = "h1")
  private WebElement title;
  @FindBy(xpath = "//div[@id='content']/ul/li/a")
  private List<WebElement> exampleLinks;

  public WebElement getTitle() {
    return title;
  }

  public void refresh() {
    driver.navigate().refresh();
    System.out.println("Refreshed page");
  }

  public List<WebElement> getExampleLinks() {
    return exampleLinks;
  }
}
