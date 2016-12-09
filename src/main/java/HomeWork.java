import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeWork {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.bing.com/");
        WebElement search = driver.findElement(By.className("b_searchbox"));
        search.sendKeys("automation");
        WebElement searchButton = driver.findElement(By.className("b_searchboxSubmit"));
        searchButton.click();
        System.out.println(driver.findElement(By.tagName("h2")).getText());
        List<WebElement> elements = driver.findElements(By.tagName("h2"));
        for (WebElement element : elements) {
            System.out.println(element.getText());
        }
        driver.quit();


    }
}
// System.out.println(elements);

