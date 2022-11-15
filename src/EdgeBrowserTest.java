import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {

    public static void main(String[] args) {
        String url = "http://the-internet.herokuapp.com/login";

        //Set Edge driver path
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        //Start Edge broswer
        WebDriver driver = new EdgeDriver();

        //Open url
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of loaded page
        System.out.println("Page Title is: " + driver.getTitle());

        //Get current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Get  web elements or page source
        System.out.println("Page source is : " + driver.getPageSource());

        //Find and enter email in email field ele
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("Admin");

        //Find nad enter password in password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //Close browser
        driver.quit();

    }

}

