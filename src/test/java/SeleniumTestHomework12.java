import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumTestHomework12 {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com");
        WebElement login = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement button = driver.findElement(By.xpath("//input[@id='login-button']"));

        login.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        button.click();
    }
    @AfterMethod
    public void setDown() {
        driver.quit();
    }
    @Test
    public void testLogin(){
        String exceptedResult = "https://www.saucedemo.com/inventory.html";

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, exceptedResult);
    }
    @Test
    public void testCart() {

        WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        WebElement cart = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));

        addToCart.click();
        cart.click();

        WebElement checkoutButton = driver.findElement(By.xpath("//button[text()='Checkout']"));
        checkoutButton.click();

        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement lastName = driver.findElement(By.id("last-name"));
        WebElement postalCode = driver.findElement(By.id("postal-code"));

        firstName.sendKeys("Anton");
        lastName.sendKeys("Petrov");
        postalCode.sendKeys("425430");

        WebElement continueButton = driver.findElement(By.id("continue"));

        continueButton.click();

        WebElement finishButton = driver.findElement(By.xpath("//button[text()='Finish']"));

        finishButton.click();

        WebElement actualResult = driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']"));

        Assert.assertTrue(actualResult.getText().contains("THANK YOU FOR YOUR ORDER"));
    }
    @Test
    public void testAddAllProduct() {
        List<WebElement> addToCart = driver.findElements(By.xpath("//button[text()='Add to cart']"));
        for (int i = 0; i<addToCart.size(); i++) {
            addToCart.get(i).click();
        }
        WebElement cartCount = driver.findElement(By.xpath("//span[text()='6']"));
        Assert.assertTrue(cartCount.getText().contains("6"));
    }


}
