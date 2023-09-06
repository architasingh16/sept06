/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author archita
 */
public class CarTest {
    private WebDriver driver;
  private String baseUrl;
    
    public CarTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data3\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
     @Test
  public void testCarCom() throws Exception {
    driver.get("https://www.car.com/");
    driver.findElement(By.linkText("New Car Quote")).click();
    driver.get("https://deal.car.com/research?thankyou_sid=34955&primary_sid=33079&utm_source=car.com&utm_medium=navigation-bar");
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    driver.findElement(By.xpath("//img[@alt='chevrolet']")).click();
    driver.get("https://deal.car.com/research/chevrolet?thankyou_sid=34955&primary_sid=33079&utm_source=car.com&utm_medium=navigation-bar");
    driver.findElement(By.xpath("//img[@alt='Blazer']")).click();
    driver.close();
  }
}
