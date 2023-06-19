package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase {








    @Test
    public void startBrowser1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andrew\\IdeaProjects\\automationCourse\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);


        // Open website + full screen
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.close();
    }


    @Test
    public void signInButton2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andrew\\IdeaProjects\\automationCourse\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        // Open website + full screen
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();

        // Open Sign In page using corresponding button on main page
        driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();

        Thread.sleep(1000);
        driver.close();
    }


    @Test
    public void validateElements3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andrew\\IdeaProjects\\automationCourse\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        // Open website + full screen
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();

        // Open Sign In page using corresponding button on main page
        driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();

        // Validate that Email field, Password field and Login button are displayed on Sign In page
        System.out.println("Email Field is ...  " + driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());
        System.out.println("Password Field is ... " + driver.findElement(By.xpath("//input[@id='password']")).isDisplayed());
        System.out.println("Log in page is ... " + driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).isDisplayed());

        Thread.sleep(1000);
        driver.close();
    }


    @Test
    public void enterInvalidData4() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andrew\\IdeaProjects\\automationCourse\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        // Open website + full screen
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();

        // Open Sign In page using corresponding button on main page
        driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();

        // Validate that Email field, Password field and Login button are displayed on Sign In page
        System.out.println("Email Field is ...  " + driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());
        System.out.println("Password Field is ... " + driver.findElement(By.xpath("//input[@id='password']")).isDisplayed());
        System.out.println("Log in page is ... " + driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).isDisplayed());

        // Enter invalid email and password in corresponding fields and click Log In button
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("wrongEmail@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123qwerty");
        driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).sendKeys(Keys.ENTER);

        Thread.sleep(1000);
        driver.close();
    }


    @Test
    public void validateInputError5() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andrew\\IdeaProjects\\automationCourse\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        // Open website + full screen
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();

        // Open Sign In page using corresponding button on main page
        driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();

        // Validate that Email field, Password field and Login button are displayed on Sign In page
        System.out.println("Email Field is ...  " + driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());
        System.out.println("Password Field is ... " + driver.findElement(By.xpath("//input[@id='password']")).isDisplayed());
        System.out.println("Log in page is ... " + driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).isDisplayed());

        // Enter invalid email and password in corresponding fields and click Log In button
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("wrongEmail@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123qwerty");
        driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).sendKeys(Keys.ENTER);

        // Validate error is appeared after invalid email and password in corresponding fields and Log In button clicked
        Thread.sleep(5000);
        System.out.println("Error is appeared ... " + driver.findElement(By.xpath("//div[@class='test-login-errors']")).isDisplayed());

        Thread.sleep(1000);
        driver.close();
    }


    @Test
    public void chackboxIsChaced6() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andrew\\IdeaProjects\\automationCourse\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

// Open website + full screen
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();

        // Open Sign In page using corresponding button on main page
        driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();

        // Validate that Email field, Password field and Login button are displayed on Sign In page
        System.out.println("Email Field is ...  " + driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());
        System.out.println("Password Field is ... " + driver.findElement(By.xpath("//input[@id='password']")).isDisplayed());
        System.out.println("Log in page is ... " + driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).isDisplayed());

        // Enter invalid email and password in corresponding fields and click Log In button
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("wrongEmail@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123qwerty");
        driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).sendKeys(Keys.ENTER);

        // Validate error is appeared after invalid email and password in corresponding fields and Log In button clicked
        Thread.sleep(5000);
        System.out.println("Incorrect email sign is ... " + driver.findElement(By.xpath("//p[contains(text(),'Error: email is incorrect')]")).isDisplayed());

        //Validate that Remember Me checkbox is checked by default
        System.out.println("checkbox is ... " + driver.findElement(By.xpath("//input[@id='auth-page-remember-me']")).isSelected());


        Thread.sleep(1000);
        driver.close();

    }
}
