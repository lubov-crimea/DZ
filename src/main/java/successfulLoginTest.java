import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class successfulLoginTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get ("https://www.linkedin.com");

        /*


        String sendName = "Alexandra";
        WebElement nameField = driver.findElement(By.id("reg-firstname"));
        nameField.sendKeys("Alexandra");
        nameField.sendKeys(Keys.ENTER);

        String sendLastname = "Mihina";
        WebElement LastnameField = driver.findElement(By.id("reg-lastname"));
        LastnameField.sendKeys("Mihina");
        LastnameField.sendKeys(Keys.ENTER);

        String sendEmail = "sandramihina";
        WebElement emailField = driver.findElement(By.id("reg-email"));
        emailField.sendKeys("sandramihina@gmail.com");
        emailField.sendKeys(Keys.ENTER);

        String sendPassword = "password";
        WebElement passwordField = driver.findElement(By.id("reg-password"));
        passwordField.sendKeys("dana2503");
        passwordField.sendKeys(Keys.ENTER);

        String sendSubmitEnter = "registration-submit";
        WebElement searchField = driver.findElement(By.id("registration-submit"));
        searchField.sendKeys(Keys.ENTER);

       проверка

        /*String sendEmail = "login-email";
        WebElement EmailField = driver.findElement(By.id("login-email"));
        EmailField.sendKeys("sandramihina@gmail.com");
        EmailField.sendKeys(Keys.ENTER);

        String sendPassword = "login-password";
        WebElement PasswordField = driver.findElement(By.id("login-password"));
        PasswordField.sendKeys("dana2503");
        PasswordField.sendKeys(Keys.ENTER);

        String sendOk = "login-submitd";
        WebElement sendOkField = driver.findElement(By.id("login-submit"));
        sendOkField.sendKeys(Keys.ENTER);  */



    }
}
