import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SeleniumStudyTest {
    private static final String CHECK_BOX = "https://demoqa.com/checkbox";
    private static final String TEXT_BOX = "https://demoqa.com/text-box";
    private static final String RADIO_BUTTON = "https://demoqa.com/radio-button";
    private static final String WEB_TABLES = "https://demoqa.com/webtables";
    private static final String BUTTONS = "https://demoqa.com/buttons";
    private static final String BROKEN = "https://demoqa.com/broken";
    private static final String DOWNLOAD = "https://demoqa.com/upload-download";
    private static final String DYNAMIC_PROPERTIES = "https://demoqa.com/dynamic-properties";
    private static final String FORM = "https://demoqa.com/automation-practice-form";

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
/*    @AfterMethod
    public void setDown() {driver.quit(); }*/

    @Test
    public void testTextBox() {
        driver.get(TEXT_BOX);
        WebElement fullName = driver.findElement(By.xpath("//input[@id='userName']"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        WebElement submitButton = driver.findElement(By.id("submit"));

        fullName.sendKeys("Andrew");
        email.sendKeys("andrew@yandex.ru");
        currentAddress.sendKeys("sdfsdghdfgjurtyurhdfghdfgjdfjdfjdfdrewtfgsdg");
        permanentAddress.sendKeys("sdfsdghdfgjurtyurhdfghdfgjdfjdfjdfdrewtfgsdg");
        submitButton.click();

        WebElement checkName = driver.findElement(By.id("name"));
        WebElement checkEmail = driver.findElement(By.id("email"));
        WebElement checkCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        WebElement checkPermanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']"));

        Assert.assertEquals(checkName.getText(), "Name:Andrew");
        Assert.assertEquals(checkEmail.getText(), "Email:andrew@yandex.ru");
        Assert.assertEquals(checkCurrentAddress.getText(), "Current Address :sdfsdghdfgjurtyurhdfghdfgjdfjdfjdfdrewtfgsdg");
        Assert.assertEquals(checkPermanentAddress.getText(), "Permananet Address :sdfsdghdfgjurtyurhdfghdfgjdfjdfjdfdrewtfgsdg");
    }

    @Test
    public void testAllCheckBox() {
        driver.get(CHECK_BOX);
        driver.findElement(By.xpath("//button[@aria-label='Expand all']")).click();
        driver.findElement(By.xpath("//span[text()='Home']")).click();
        WebElement exeptedCheckBox = driver.findElement(By.xpath("//span[text()='home']"));

        Assert.assertEquals(exeptedCheckBox.getText(), "home");
    }

    @Test
    public void testRadioButton() {
        driver.get(RADIO_BUTTON);
        driver.findElement(By.xpath("//label[text()='Yes']")).click();
        WebElement selectedYes = driver.findElement(By.xpath("//span[text()='Yes']"));
        Assert.assertEquals(selectedYes.getText(), "Yes");
    }

    @Test
    public void testAddTable() {
        driver.get(WEB_TABLES);
        String firstName = "Andrew";
        String lastName = "Petrov";
        String email = "andrew_petrov@yandex.ru";
        String age = "19";
        String salary = "150000";
        String department = "QA";

        WebElement addRows = driver.findElement(By.xpath("//button[text()='Add']"));
        addRows.click();

        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstName);
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='age']")).sendKeys(age);
        driver.findElement(By.xpath("//input[@id='salary']")).sendKeys(salary);
        driver.findElement(By.xpath("//input[@id='department']")).sendKeys(department);
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        Assert.assertEquals(driver.findElement(By.xpath("//div[text()=" + "'" + firstName + "']")).getText(), firstName);
    }

    @Test
    public void testButtonDoubleClick() {
        driver.get(BUTTONS);
        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
        Actions action = new Actions(driver);
        action.doubleClick(doubleClickButton);
        Assert.assertEquals(driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).getText(), "You have done a double click");
    }

    @Test
    public void testRightClick() {
        driver.get(BUTTONS);
        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        Actions action = new Actions(driver);
        action.contextClick(rightClickButton);
        Assert.assertEquals(driver.findElement(By.id("rightClickMessage")).getText(), "You have done a right click");
    }

    @Test
    public void testUpload() {
        driver.get(DOWNLOAD);
        File file = new File("C://Users//QA//Documents//LetsView//LetsView//20211022_163453.jpg");
        WebElement uploadButton = driver.findElement(By.id("uploadFile"));
        uploadButton.sendKeys(file.getAbsolutePath());
        Assert.assertEquals(driver.findElement(By.id("uploadedFilePath")).getText(), "C:\\fakepath\\20211022_163453.jpg");
    }



}
