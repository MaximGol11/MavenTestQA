import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StepikTaks_3 {

    @Test
    public void filForm_2() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/QA/IdeaProjects/MavenTestQA/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://suninjuly.github.io/find_xpath_form");

        WebElement firstName = driver.findElement(By.name("first_name"));
        WebElement lastName = driver.findElement(By.name("last_name"));
        WebElement city = driver.findElement(By.name("firstname"));
        WebElement country = driver.findElement(By.id("country"));
        WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));


        firstName.sendKeys("Maxim");
        lastName.sendKeys("Maximov");
        city.sendKeys("Moscow");
        country.sendKeys("Russia");
        submit.click();
    }
}
