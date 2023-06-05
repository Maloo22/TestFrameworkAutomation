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
        try {
            TimeUnit.SECONDS.sleep(5); // Задержка в 5 секунду
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();

    }
}
