package com.example.Prova1;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import java.io.File;

public class Test_Hooks{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  JavascriptExecutor js;
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void test_loc_Hooks_release_1_1() throws Exception{
    driver.get("http://localhost:4200/");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//input[1][@value='']")).click();
    driver.findElement(By.xpath("//input[1][@value='']")).clear();
    driver.findElement(By.xpath("//input[1][@value='']")).sendKeys("odoobnb@gmail.com");
    driver.findElement(By.xpath("//input[1][@aria-describedby='password-error']")).click();
    driver.findElement(By.xpath("//input[1][@aria-describedby='password-error']")).clear();
    driver.findElement(By.xpath("//input[1][@aria-describedby='password-error']")).sendKeys("provaprova93");
    driver.findElement(By.xpath("//span[1][@class='Type__TypeElement-goli3j-0 dmuHFl sc-hKwDye fXzRSj']")).click();
    driver.findElement(By.xpath("//*[@x448533202421-x-test-tpl-1]//*[@x448533202421-x-test-hook-29]//*[@x448624268039-x-test-tpl-1]//*[@x448627084077-x-test-tpl-3]//*[@x448627084077-x-test-hook-4][2]//*[@x448627084077-x-test-hook-5]")).click();
    driver.findElement(By.xpath("//*[@x448533202421-x-test-tpl-1]//*[@x448533202421-x-test-hook-29]//*[@x448624268039-x-test-tpl-3]//*[@x448624897747-x-test-tpl-2]//*[@x448594643043-x-test-tpl-1]//*[@x448594643043-x-test-hook-3]//*[@x448605300685-x-test-tpl-1]//*[@x448605300685-x-test-hook-4]")).sendKeys("marco");
    driver.findElement(By.xpath("//*[@x448533202421-x-test-tpl-1]//*[@x448533202421-x-test-hook-29]//*[@x448624268039-x-test-tpl-3]//*[@x448624897747-x-test-tpl-2]//*[@x448594643043-x-test-tpl-1]//*[@x448594643043-x-test-hook-3]//*[@x448605300685-x-test-tpl-1]//*[@x448605300685-x-test-hook-4]")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//*[@x448533202421-x-test-tpl-1]//*[@x448533202421-x-test-hook-29]//*[@x448624268039-x-test-tpl-3]//*[@x448624897747-x-test-tpl-2]//*[@x448594643043-x-test-tpl-1]//*[@x448594643043-x-test-hook-14][1]//*[@x448545732489-x-test-tpl-1]//*[@x448621166798-x-test-hook-9]")).click();
    Thread.sleep(5000);
    assertEquals("Marco Mengoni",driver.findElement(By.xpath("//*[@x448533202421-x-test-tpl-1]//*[@x448533202421-x-test-hook-29]//*[@x448624268039-x-test-tpl-3]//*[@x448624897747-x-test-tpl-2]//*[@x448547119507-x-test-hook-3]//*[@x448607117010-x-test-tpl-2]//*[@x448607117010-x-test-hook-4]")).getText());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
