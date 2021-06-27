package pages;


public class YahooMainPage extends BasePage {

    String linkMail = "//a[contains(text(),'Mail')]";
    String linkNews = "//a[contains(text(),'News')]";
    String linkFinance = "//a[contains(text(),'Finance')]";
    String linkLifeStyle = "//a[contains(text(),'Lifestyle')]";
    String linkWomen = "//a[contains(text(),'Women')]";


    public YahooMainPage() {
    }


    public void createListOfLinks() throws Exception {
        try {
            String mailLink = pageWebDriver.getWebLinkDisplayed(linkMail);
            System.out.println("Link for Mail: " + mailLink);
            String newsLink = pageWebDriver.getWebLinkDisplayed(linkNews);
            System.out.println("Link for News: " + newsLink);
            String financeLink = pageWebDriver.getWebLinkDisplayed(linkFinance);
            System.out.println("Link for Finance: " + financeLink);
            String lifeStyle = pageWebDriver.getWebLinkDisplayed(linkLifeStyle);
            System.out.println("Link for LifeStyle: " + lifeStyle);
            String women = pageWebDriver.getWebLinkDisplayed(linkWomen);
            System.out.println("Link for Women: " + women);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}