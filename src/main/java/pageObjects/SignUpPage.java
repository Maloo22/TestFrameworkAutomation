package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SignUpPage extends BaseMain{

    public SignUpPage(WebDriver driver) {
        super(driver);
    }


    public void getDropDownContent () {
        WebElement DropDownElement;
        DropDownElement = driver.findElement(By.id("job-title"));
        Select searchDropDown = new Select(DropDownElement);
        List<WebElement> options = new ArrayList<>();
        options = searchDropDown.getOptions();
        int listSize = options.size();
        for (int i = 0; i < listSize; i++) {
            System.out.println(options.get(i).getText());
        }
    }








}
