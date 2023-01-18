import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleTest {
    WebDriver driver;


    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void SearchGoogleTest(){
        driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement acceptCookiesBotton= driver.findElement(By.id("L2AGLb"));
        acceptCookiesBotton.click();

        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Google Atelierul Digital", Keys.ENTER);
    }
}

