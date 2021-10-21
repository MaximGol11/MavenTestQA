import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class StepikTask_2 {

    @Test
    public void filHugeForm() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/QA/IdeaProjects/MavenTestQA/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://suninjuly.github.io/huge_form.html");

        List<WebElement> fields = driver.findElements(By.tagName("br"));
    }
}
