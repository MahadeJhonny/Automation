package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CommonApi {
    public WebDriver driver=null;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "//Users//mahadejhonny//Downloads//chromedriver");
        WebDriver driver= new ChromeDriver ();

        driver.manage ().timeouts ().implicitlyWait ( 20, TimeUnit.SECONDS );
        driver.get("https://www.walmart.com/");
        System.out.println (driver.getTitle ());
        driver.close ();
    }

    public void cleanUp () {
        driver.close ();
    }
}
