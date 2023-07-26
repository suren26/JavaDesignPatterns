package pages;

import driver.DriverManager;
import driver.DriverManagerFactory;
import lombok.extern.java.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Loginpage {
    WebDriver driver;
   @FindBy(id = "user-name")
    private WebElement username;
   @FindBy(id = "password")
    private WebElement password;

    public void login(WebDriver driver){
        String userName="standard_user";
        String pwd="secret_sauce";
        username.sendKeys(userName);
        password.sendKeys(pwd);
        //return Loginpage;
    }
    public Loginpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}