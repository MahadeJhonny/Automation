package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

    public class AmazonTest {
       WebDriver driver=null;



    @BeforeMethod
    public void setUp() throws NullPointerException{
        System.setProperty("webdriver.chrome.driver", "//Users//mahadejhonny//Downloads//chromedriver");
        WebDriver driver= new ChromeDriver ();
        driver.manage ().timeouts ().implicitlyWait ( 20, TimeUnit.SECONDS );
        driver.get("https://www.amazon.com/");
    }
    @Test
    public void test1() throws InterruptedException  {
        System.out.println (driver.getTitle ());
        driver.findElement ( By.id ( "twotabsearchtextbox" ) ).sendKeys ( "Laptop" );
        driver.findElement ( By.className ( ".nav-input" ) ).click ();
        Thread.sleep ( 2000 );
    }
    @AfterMethod
    public void cleanUp()  {
        driver.close ();




    }









    }

