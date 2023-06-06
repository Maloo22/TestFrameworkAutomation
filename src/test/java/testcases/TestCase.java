package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase {

    @Test
    public void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andrew\\IdeaProjects\\automationCourse\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://ttrsonline.com/Account/LogOn");
        driver.manage().window().maximize();

        try {                                           // 5 sec hold  -  by chat GPT  -  from here
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }                                               // 5 sec hold  -  by chat GPT  -  to here

        driver.close();
        System.out.println("First HW  +  a small part of out-of-class work");

    }
}
