import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumReview_1 {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:/Users/QA/IdeaProjects/MavenTestQA/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.99-bottles-of-beer.net");
    }


    @Test
    public void findHeader() {

        WebElement header = driver.findElement(By.xpath("//h2[text()='Welcome to 99 Bottles of Beer']"));

        Assert.assertEquals(header, "Welcome to 99 Bottles of Beer");
    }

    @Test
    public void equalsURL() {
        String expectedUrl= "http://www.99-bottles-of-beer.net/";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }
}
