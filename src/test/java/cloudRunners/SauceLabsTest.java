package cloudRunners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import utilities.PropertyReader;

import java.net.MalformedURLException;
import java.net.URL;
import org.testng.asserts.*;

//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.MutableCapabilities;

public class SauceLabsTest {

    public static void main(String[] args) throws MalformedURLException {

        PropertyReader propertyReader = new PropertyReader();
        String USERNAME = propertyReader.readProperty("SAUCE_LAB_USERNAME");
        String ACCESS_KEY = propertyReader.readProperty("SAUCE_LAB_ACCESS_KEY");
        String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

        // on new selenium
//        MutableCapabilities sauceOptions = MutableCapabilities().chrome;
//        ChromeOptions browserOptions = new ChromeOptions();
//        browserOptions.setExperimentalOption("w3c", true);
//        browserOptions.setCapability("platformName", "Windows 7");
//        browserOptions.setCapability("browserVersion", "55.0");
//        browserOptions.setCapability("sauce:options", sauceOptions);

        // on legacy selenium
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("platform", "Windows 7");
//        caps.setCapability("version", "55.0");
//        caps.setCapability("browserName", "chrome");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platform", "macOS 10.14");
        caps.setCapability("version", "latest");
        caps.setCapability("browserName", "safari");


        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println("title = " + title);
        Assert.assertEquals(title,("Google"));
    }

}
