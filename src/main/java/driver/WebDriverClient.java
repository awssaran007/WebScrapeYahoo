package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebDriverClient {

    WebDriver driver;
    WebElement e;


    public WebDriverClient() {
        driver = DriverManager.getWebDriverClient();
    }


    public String title() {
        return driver.getTitle();
    }


    public void launchURL(String url) throws Exception {
        try {
            System.out.println("Navigating to url: " + url);
            driver.get(url);
        }
        catch (Exception e) {
            throw new Exception("Unable to reach URL :" + url, e);
        }
    }


    public String getWebLinkDisplayed(String xpath) throws Exception {
        e = driver.findElement(By.xpath(xpath));
        return e.getAttribute("href");
    }


}
