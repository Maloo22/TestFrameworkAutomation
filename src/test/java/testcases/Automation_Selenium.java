package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Automation_Selenium {

    public ChromeDriver driver;
    public String WebsiteURL = "https://test.my-fork.com/";
    public Locators locators = new Locators();
    public String emailField = "//input[@id='email']";
    public String passwordField = "//input[@id='password']";

    @BeforeMethod
    public void startAndFullScreen () throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andrew\\IdeaProjects\\automationCourse\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    public void takeMeToSignInPage(){
        // Open website + full screen
        driver.get(WebsiteURL);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }

    @Test
    public void startBrowser1() throws InterruptedException {
    takeMeToSignInPage();
    }

    public void signInButton2() throws InterruptedException {
        takeMeToSignInPage();
        // Open Sign In page using corresponding button on main page
        driver.findElement(locators.signInBtn).click();
    }

    @Test
    public void validateElements3() throws InterruptedException {
        takeMeToSignInPage();

        // Open Sign In page using corresponding button on main page
        signInButton2();

        // Validate that Email field, Password field and Login button are displayed on Sign In page
        System.out.println("Email Field is ...  " + driver.findElement(By.xpath(emailField)).isDisplayed());
        System.out.println("Password Field is ... " + driver.findElement(By.xpath(passwordField)).isDisplayed());
        System.out.println("Log in page is ... " + driver.findElement(locators.logInBtn).isDisplayed());
    }

    public void fillCredentials (String email, String password){
        driver.findElement(By.xpath(emailField)).sendKeys("wrongEmail@gmail.com");
        driver.findElement(By.xpath(passwordField)).sendKeys("123qwerty");
    }

    @Test
    public void enterInvalidData4() throws InterruptedException {
        takeMeToSignInPage();

        // Open Sign In page using corresponding button on main page
        driver.findElement(locators.signInBtn).click();

        // Validate that Email field, Password field and Login button are displayed on Sign In page
        System.out.println("Email Field is ...  " + driver.findElement(By.xpath(emailField)).isDisplayed());
        System.out.println("Password Field is ... " + driver.findElement(By.xpath(passwordField)).isDisplayed());
        System.out.println("Log in page is ... " + driver.findElement(locators.logInBtn).isDisplayed());

        // Enter invalid email and password in corresponding fields and click Log In button
        fillCredentials("wrongEmail@gmail.com", "123qwerty");
        driver.findElement(locators.logInBtn).sendKeys(Keys.ENTER);
    }


    @Test
    public void validateInputError5() throws InterruptedException {
        takeMeToSignInPage();

        // Open Sign In page using corresponding button on main page
        driver.findElement(locators.signInBtn).click();

        // Validate that Email field, Password field and Login button are displayed on Sign In page
        System.out.println("Email Field is ...  " + driver.findElement(By.xpath(emailField)).isDisplayed());
        System.out.println("Password Field is ... " + driver.findElement(By.xpath(passwordField)).isDisplayed());
        System.out.println("Log in page is ... " + driver.findElement(locators.logInBtn).isDisplayed());

        // Enter invalid email and password in corresponding fields and click Log In button
        fillCredentials("wrongEmail@gmail.com", "123qwerty");
        driver.findElement(locators.logInBtn).sendKeys(Keys.ENTER);

        // Validate error is appeared after invalid email and password in corresponding fields and Log In button clicked
        Thread.sleep(5000);
        System.out.println("Error is appeared ... " + driver.findElement(By.xpath("//div[@class='test-login-errors']")).isDisplayed());
    }

    @Test
    public void chackboxIsChaced6() throws InterruptedException {
        takeMeToSignInPage();

        // Open Sign In page using corresponding button on main page
        driver.findElement(locators.signInBtn).click();

        // Validate that Email field, Password field and Login button are displayed on Sign In page
        System.out.println("Email Field is ...  " + driver.findElement(By.xpath(emailField)).isDisplayed());
        System.out.println("Password Field is ... " + driver.findElement(By.xpath(passwordField)).isDisplayed());
        System.out.println("Log in page is ... " + driver.findElement(locators.logInBtn).isDisplayed());

        // Enter invalid email and password in corresponding fields and click Log In button
        fillCredentials("wrongEmail@gmail.com", "123qwerty");
        driver.findElement(locators.logInBtn).sendKeys(Keys.ENTER);

        // Validate error is appeared after invalid email and password in corresponding fields and Log In button clicked
        Thread.sleep(5000);
        System.out.println("Incorrect email sign is ... " + driver.findElement(By.xpath("//p[contains(text(),'Error: email is incorrect')]")).isDisplayed());

        //Validate that Remember Me checkbox is checked by default
        System.out.println("checkbox is ... " + driver.findElement(By.xpath("//input[@id='auth-page-remember-me']")).isSelected());
    }
}
