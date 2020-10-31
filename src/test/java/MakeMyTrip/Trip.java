package MakeMyTrip;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trip {
public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("https://www.makemytrip.com/");
 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 
 //WebElement element = driver.findElement(By.xpath("//p[@class='font12 lineHeight16'][1]"));
/* List<WebElement> list = element.findElements(By.tagName("a"));
 for (int i = 0; i < list.size(); i++) {
	WebElement getList = list.get(i);
String text = getList.getText();
System.out.println(text);
 }*/
 JavascriptExecutor jk= (JavascriptExecutor) driver;
  WebElement element2 = driver.findElement(By.xpath("//div[@class='flexOne'][1]"));
 String text1 = element2.getText();
 System.out.println(text1);
 
 WebElement search = driver.findElement(By.xpath("//a[text()='Search']"));
 jk.executeScript("arguments[0].click()", search);
 

}
}
