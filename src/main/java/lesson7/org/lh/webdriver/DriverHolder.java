package lesson7.org.lh.webdriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class DriverHolder {
    private Map<Long, WebDriver> drivers = new HashMap<>();

    private static DriverHolder instance = null;

    private DriverHolder() {
    }

    public static DriverHolder getInstance() {
        if (instance == null) {
            instance = new DriverHolder();
        }
        return instance;
    }

    public void initDriver(WebDriverEnum webDriverEnum) {
        Long threadId = Thread.currentThread().getId();

        if (!drivers.containsKey(threadId)) {
            drivers.put(threadId, WebDriverFactory.initDriver(webDriverEnum));
        }
    }

    public WebDriver getDriver() {
        Long threadId = Thread.currentThread().getId();
        return drivers.get(threadId);
    }

    public JavascriptExecutor getJavaScriptExecutor() {
        return (JavascriptExecutor) getDriver();
    }

}
