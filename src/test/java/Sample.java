import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.net.URL;

public class Sample {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
//        driver.get("https://selenium.dev");
        driver.get("http://localhost:3000/");

//        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
//        FirefoxOptions firefoxOptions = new FirefoxOptions();
////        WebDriver driver = new RemoteWebDriver(new URL("http://www.example.com"), firefoxOptions);
//        WebDriver driver = new FirefoxDriver(firefoxOptions);
//        driver.get("http://localhost:3000/");
////        driver.quit();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("console.log('selenium JS Test');");
        js.executeScript("document.body.textContent =\n" +
                "    \"clientX: \" + event.clientX +\n" +
                "    \" - clientY: \" + event.clientY;;");

        Robot r = new Robot();
        r.keyPress(MouseEvent.MOUSE_CLICKED);
        r.mouseMove(300, 300);

        // monitorEvents(window)

        WebElement element = driver.findElement(By.xpath("//canvas"));
//        Actions builder = new Actions(driver);
//        Action drawAction = builder.moveToElement(element,100,100) //start points x axis and y axis.
//                .click()
////                .moveByOffset(200, 60) // 2nd points (x1,y1)
////                .click()
////                .moveByOffset(100, 70)// 3rd points (x2,y2)
////                .doubleClick()
//                .build();
//        drawAction.perform();


        driver.quit();
    }
}
