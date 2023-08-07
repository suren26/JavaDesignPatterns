package pages;

import lombok.extern.java.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpage {
    WebDriver driver;
    @FindBy(id = "user-name")
    private WebElement username;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement loginbutton;

    public Loginpage login() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        String userName = "standard_user";
        String pwd = "secret_sauce";
        username.sendKeys(userName);
        password.sendKeys(pwd);
        loginbutton.click();
        Thread.sleep(10000);
        return this;
    }

    public void logout() {

    }

    public Loginpage using(WebDriver driver) {
        return new Loginpage(driver);
    }

    public Loginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}