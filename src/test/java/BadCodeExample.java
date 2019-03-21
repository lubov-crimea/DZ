import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class BadCodeExample {
    public static void main(String[] args) {
        System.out.println("Hello DZ!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        String searchTerm = "Selenium";
        WebElement searchField = driver.findElement(By.xpath("//input[@name='q']"));
        searchField.sendKeys("Selenium");
        searchField.sendKeys(Keys.ENTER);

        List<WebElement> searchResults;
        searchResults = driver.findElements(By.xpath("//div[@class='srg']/div[@class='g']"));
        System.out.println((searchResults).size());
        //for each WebElement in resultList print Text

        int iterator =0;
        for (WebElement searchResult : searchResults) {
            iterator++;
            String searchResultString = searchResult.getText();
            //kod kotory privyazka k zifre hyje
            //for (int iterator = 0; iterator < searchResults.size(); iterator++) {
            System.out.println("Result number: " + iterator);  // vuvodit nomer spiska
            System.out.println(searchResultString);
            if (searchResultString.toLowerCase().contains(searchTerm.toLowerCase())) {
                System.out.println("SearchTerm found");
            } else {
                System.out.println("SearchTerm not found");
            }

        }

    }
}
