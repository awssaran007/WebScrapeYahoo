package core;


import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import pages.YahooMainPage;


public class Controller {

    WebDriver driver;

    public Controller() {
        this.driver = DriverManager.getWebDriverClient();
    }

    public YahooMainPage yahooLandingPage() {  return new YahooMainPage();  }

}

