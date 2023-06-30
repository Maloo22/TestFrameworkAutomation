package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseMain{

    public HomePage (WebDriver driver) {
        super(driver);
    }

    //locators
    public String WebsiteURL = "https://test.my-fork.com/";
    public String signInBtn = "//a[@class='menu-item log-in-button']";

    public void clickSignIn(){
        // Open website + full screen
        driver.get(WebsiteURL);
        driver.manage().window().maximize();
        driver.findElement(By.xpath(signInBtn)).click();
    }

}
