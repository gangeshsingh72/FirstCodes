import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Parentchld {

	public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub - 71 Code Download

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gangesh_kr\\chromedriver_win32\\chromedriver.exe"
				);
					
	//	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//*[text()='Click Here']")).click();
		
/*		Set<String>ids=driver.getWindowHandles();
		System.out.println(driver.getTitle());	
// 		Iterator<String> id=ids.iterator();
		String parentid = ids.iterator().next();
		String childid = ids.iterator().next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());	
//		System.out.println(driver.getTitle());	
*/		
		String parent =driver.getWindowHandle();
		Set<String>ids=driver.getWindowHandles();
		System.out.println("Parent Window : "+ parent);
		
		for(String currenthandle : ids )
		{
//			System.out.println("Parent Window : "+ parent);
     		if(!currenthandle.equalsIgnoreCase(parent))
     		{
     			driver.switchTo().window(currenthandle);
     			System.out.println("Child Window : "+ driver.getTitle());
     			System.out.println(driver.findElement(By.xpath("//*[text()='New Window']")).getText());
     			driver.close();
     		}
		}	
			
				driver.switchTo().window(parent);	
				System.out.println(driver.findElement(By.xpath("//*[text()='Opening a new window']")).getText());
				System.out.println("Parent Window : "+ driver.getTitle());
	
	}
}
