import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class successfulLoginTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get ("https://www.linkedin.com");

        String sendName = "Alexandra";
        WebElement searchField = driver.findElement(By.id("reg-firstname"));
        searchField.sendKeys("Alexandra");
        searchField.sendKeys(Keys.ENTER);

        String sendLastname = "Mihina";
        WebElement searchField = driver.findElement(By.id("reg-lastname"));
        searchField.sendKeys("Mihina");
        searchField.sendKeys(Keys.ENTER);

        String sendEmail = "sandramihina";
        WebElement searchField = driver.findElement(By.id("reg-email"));
        searchField.sendKeys("sandramihina@gmail.com");
        searchField.sendKeys(Keys.ENTER);

        String sendPassword = "password";
        WebElement searchField = driver.findElement(By.id("reg-password"));
        searchField.sendKeys("dana2503");
        searchField.sendKeys(Keys.ENTER);

        String sendSubmitEnter = "registration-submit";
        WebElement searchField = driver.findElement(By.id("registration-submit"));
        searchField.sendKeys(Keys.ENTER);

// проверка
        String sendEmail = "login-email";
        WebElement searchField = driver.findElement(By.id("login-email"));
        searchField.sendKeys("sandramihina@gmail.com");
        searchField.sendKeys(Keys.ENTER);

        String sendPassword = "login-password";
        WebElement searchField = driver.findElement(By.id("login-password"));
        searchField.sendKeys("dana2503");
        searchField.sendKeys(Keys.ENTER);

        String sendOk = "login-submitd";
        WebElement searchField = driver.findElement(By.id("login-submit"));
        searchField.sendKeys(Keys.ENTER);



    }
}
