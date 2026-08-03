package io.cucumber.pageobject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

public class BasicAuth extends Page{

    public BasicAuth(ChromeDriver driver) {
        super(driver);
    }

    public void typeString(Robot robot, String e) {
        for (char s: e.toCharArray()) {
            int code = KeyEvent.getExtendedKeyCodeForChar(s);
            robot.keyPress(code);
            robot.keyRelease(code);
        }

    }
}
