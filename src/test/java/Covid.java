import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Covid {
	static int k;
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\prakash\\Covid19\\driver\\chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://covidindia.org/");
	 driver.manage().window().maximize();
	 
	 //WebElement table = driver.findElement(By.xpath("//table[@id='tablepress-96']"));
	 
	/* List<WebElement> allRows = table.findElements(By.tagName("tr"));
	 for (int i = 0; i < allRows.size(); i++) {
		System.out.println(allRows.get(i).getText());*/
		 
		
	/*	 WebElement eachRow = allRows.get(i);
		 List<WebElement> allData = eachRow.findElements(By.tagName("td"));
		 for (int j = 0; j < allData.size(); j++) {
			System.out.println(allData.get(j).getText());
		}*/
		
		 WebElement tab	= driver.findElement(By.xpath("//table[@id='tablepress-96']"));
		List<WebElement> totRow = tab.findElements(By.tagName("tr"));
		for (int j = 0; j < totRow.size(); j++) {
			WebElement eachrow = totRow.get(j);		
			List<WebElement> alldata = eachrow.findElements(By.tagName("td"));
			for (int i = 0; i < alldata.size()-2; i++) {
				String text = alldata.get(i).getText();
				System.out.println(text);
			}	
		}
		
}
	
}

