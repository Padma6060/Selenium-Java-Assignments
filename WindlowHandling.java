package org.testleaf.week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindlowHandling {

public static void main(String[] args) {

        ChromeOptions opt = new ChromeOptions();
        
        opt.addArguments("guest");

        ChromeDriver driver = new ChromeDriver(opt);

        driver.get("http://leaftaps.com/opentaps/control/main");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement usernameTextField = driver.findElement(By.id("username"));

        usernameTextField.sendKeys("DemoSalesManager");

        driver.findElement(By.id("password")).sendKeys("crmsfa");

        driver.findElement(By.className("decorativeSubmit")).click();

        driver.findElement(By.partialLinkText("CRM")).click();

        driver.findElement(By.linkText("Contacts")).click();

        driver.findElement(By.linkText("Merge Contacts")).click();

        String parentWindow = driver.getWindowHandle();

        driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();

        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {

            if (!window.equals(parentWindow)) {

                driver.switchTo().window(window);

                break;
            }
        }
        driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();

        driver.switchTo().window(parentWindow);

        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

                allWindows = driver.getWindowHandles();

        for (String window : allWindows) {

            if (!window.equals(parentWindow)) {

                driver.switchTo().window(window);

                break;
            }
        }

        driver.findElement(By.linkText("DemoContact2")).click();

        driver.switchTo().window(parentWindow);

        driver.findElement(By.className("buttonDangerous")).click();

        Alert simpleAlert = driver.switchTo().alert();

        simpleAlert.accept();

        System.out.println("Title : " + driver.getTitle());

        driver.quit();


                
        }

       

}
