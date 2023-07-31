package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Productpage {
    WebDriver driver;

    @FindBy(xpath = "//div[@class='header_label']")
    private WebElement swaglabs;
    @FindBy(xpath="//div[@id='shopping_cart_container']/a")
    private WebElement cart;
    @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement saucelabsBackpack;

    @FindBy(xpath="//div[@id='shopping_cart_container']/a/span")
    private WebElement addedCart;

    public boolean swaglabs() {
        if(swaglabs.isDisplayed()){
            System.out.println("Swag Labs loaded");
            return true;
        }
        else{
            return false;
        }

    }
    public Productpage addToCart() {

        if(swaglabs.isDisplayed() && cart.isDisplayed()){
            System.out.println("Swag Labs loaded");
            saucelabsBackpack.click();
            return this;
        }
    return this;
    }
    public Productpage checkAddToCart() {
        if(Integer.parseInt(addedCart.getText())>0) {
            System.out.println("Product added in cart Successfully");
        }
        else{
            System.out.println("Product not added in cart !!!!!");
        }
        return this;
    }

    public Productpage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public static Productpage using(WebDriver driver){
        return new Productpage(driver);
    }
}
