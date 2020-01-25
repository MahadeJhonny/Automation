package cnn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CnnHome {

            public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "//Users//mahadejhonny//Downloads//chromedriver");
            WebDriver driver= new ChromeDriver ();


            driver.manage ().timeouts ().implicitlyWait ( 20, TimeUnit.SECONDS );
            driver.get("https://www.cnn.com/");
            System.out.println (driver.getTitle ());
            driver.close ();
    }
}
