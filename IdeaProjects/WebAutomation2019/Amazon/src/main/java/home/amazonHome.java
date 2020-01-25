package home;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class amazonHome extends CommonApi {


    @Test
    public void test1() throws InterruptedException {
        System.out.println ( driver.getTitle () );
        driver.findElement ( By.id ( "twotabsearchtextbox" ) ).sendKeys ( "Laptop" );
        driver.findElement ( By.className ( ".nav-input" ) ).click ();
        Thread.sleep ( 2000 );

    }
}
