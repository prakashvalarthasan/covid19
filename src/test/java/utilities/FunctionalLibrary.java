	package utilities;
	
	import java.util.concurrent.TimeUnit;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;
	
	public class FunctionalLibrary {
		public static WebDriver driver;
		
	public static  WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	    System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
	   driver = new ChromeDriver();
	   return driver;
	}
	
	public void loadUrl(String url) {
	driver.get(url);	
	 maximize();
	implicitWait();
	 }
	
	public void maximize() {
		driver.manage().window().maximize();
	}
	
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void type(WebElement element,String data) {
		element.sendKeys(data);
	}
	public void click(WebElement element) {
		element.click();
	}
	
	public void quit() {
		driver.quit();
	}
	
	public void selectByText(WebElement element, String data) {
		Select s = new Select(element);
	    s.selectByVisibleText(data); 
	
	}
	
	public void selectByIndex(WebElement element,int index) {
	 new Select(element).selectByIndex(index);
	 }
	
	public String getAttributeValue(WebElement element) {
		return element.getAttribute("value");
		}
	
	}
