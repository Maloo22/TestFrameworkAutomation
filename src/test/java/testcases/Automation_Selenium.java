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
    //public Locators locators = new Locators(); - подвязка файла с локаторами
    public String emailField = "//input[@id='email']";
    public String passwordField = "//input[@id='password']";
    public String signInBtn = "//a[@class='menu-item log-in-button']";
    public String logInBtn = "//button[contains(text(),'Log In')]";
    public String validMessage = "//p[contains(text(),'Error: email is incorrect')]";
    public String validMessDisp = "//div[@class='test-login-errors']";
    public String checkbox = "//input[@id='auth-page-remember-me']";

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

    public void fillCredentials (String email, String password){
        driver.findElement(By.xpath(emailField)).sendKeys("email");
        driver.findElement(By.xpath(passwordField)).sendKeys("password");
    }

    @Test
    public void startBrowser1() throws InterruptedException {
    takeMeToSignInPage();
    }

    public void signInButton2() throws InterruptedException {
        takeMeToSignInPage();
        // Open Sign In page using corresponding button on main page
        driver.findElement(By.xpath(signInBtn)).click();
    }

    public void validEmailPassFieldsAndLogInBtnIsDispl() throws InterruptedException {
    System.out.println("Email Field is ...  " + driver.findElement(By.xpath(emailField)).isDisplayed());
    System.out.println("Password Field is ... " + driver.findElement(By.xpath(passwordField)).isDisplayed());
    System.out.println("Log in page is ... " + driver.findElement(By.xpath(logInBtn)).isDisplayed());
    }

    @Test
    public void validateElements3() throws InterruptedException {
        takeMeToSignInPage();

        // Open Sign In page using corresponding button on main page
        signInButton2();

        // Validate that Email field, Password field and Login button are displayed on Sign In page
        validEmailPassFieldsAndLogInBtnIsDispl();
    }

    @Test
    public void enterInvalidData4() throws InterruptedException {
        takeMeToSignInPage();

        // Open Sign In page using corresponding button on main page
        driver.findElement(By.xpath(signInBtn)).click();

        // Validate that Email field, Password field and Login button are displayed on Sign In page
        validEmailPassFieldsAndLogInBtnIsDispl();

        // Enter invalid email and password in corresponding fields and click Log In button
        fillCredentials("wrongEmail1@gmail.com", "123qwerty1");
        driver.findElement(By.xpath(logInBtn)).sendKeys(Keys.ENTER);
    }

    @Test
    public void validateInputError5() throws InterruptedException {
        takeMeToSignInPage();

        // Open Sign In page using corresponding button on main page
        driver.findElement(By.xpath(signInBtn)).click();

        // Validate that Email field, Password field and Login button are displayed on Sign In page
        validEmailPassFieldsAndLogInBtnIsDispl();

        // Enter invalid email and password in corresponding fields and click Log In button
        fillCredentials("wrongEmail2@gmail.com", "123qwerty2");
        driver.findElement(By.xpath(logInBtn)).sendKeys(Keys.ENTER);

        // Validate error is appeared after invalid email and password in corresponding fields and Log In button clicked
        Thread.sleep(5000);
        System.out.println("Error is appeared ... " + driver.findElement(By.xpath(validMessDisp)).isDisplayed());
    }

    @Test
    public void checkboxIsChaced6() throws InterruptedException {
        takeMeToSignInPage();

        // Open Sign In page using corresponding button on main page
        driver.findElement(By.xpath(signInBtn)).click();

        // Validate that Email field, Password field and Login button are displayed on Sign In page
        validEmailPassFieldsAndLogInBtnIsDispl();

        // Enter invalid email and password in corresponding fields and click Log In button
        fillCredentials("wrongEmail3@gmail.com", "123qwerty3");
        driver.findElement(By.xpath(logInBtn)).sendKeys(Keys.ENTER);

        // Validate error is appeared after invalid email and password in corresponding fields and Log In button clicked
        Thread.sleep(5000);
        System.out.println("Incorrect email sign is ... " + driver.findElement(By.xpath(validMessage)).isDisplayed());

        //Validate that Remember Me checkbox is checked by default
        System.out.println("checkbox is ... " + driver.findElement(By.xpath(checkbox)).isSelected());

    }

    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }
}
