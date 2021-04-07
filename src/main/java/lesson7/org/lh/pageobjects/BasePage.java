package lesson7.org.lh.pageobjects;

import lesson7.org.lh.webdriver.DriverHolder;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage () {
        PageFactory.initElements(DriverHolder.getInstance().getDriver(), this);
    }

    protected void sleep(long secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
