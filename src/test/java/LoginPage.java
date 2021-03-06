import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    private WebElement emailField;
    private WebElement passwordField;
    private WebElement signInButton;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        initElements();
    }
    private void initElements() {
        emailField = driver.findElement(By.xpath("//input[@id='login-email']"));
        passwordField = driver.findElement(By.xpath("//input[@id='login-password']"));
        signInButton = driver.findElement(By.xpath("//input[@id='login-submit']"));
    }

    public <GenericPage> GenericPage login(String userEmail, String userPassword) {
        emailField.sendKeys(userEmail);
        passwordField.sendKeys(userPassword);
        signInButton.click();
        if (driver.getCurrentUrl().contains("/feed")) {
            return (GenericPage) PageFactory.initElements(driver, HomePage.class);
        }
        if (driver.getCurrentUrl().contains("/login-submit")) {
            return (GenericPage) new LoginSubmitPage(driver);
        } else {
            return (GenericPage) new LoginPage(driver);
        }
    }

    public boolean isPageLoaded() {
        return signInButton.isDisplayed();
    }
}