import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Autodropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gangesh_kr\\chromedriver_win32\\chromedriver.exe"
);
		WebDriver driver=new ChromeDriver();		
		
		driver.get("https://www.makemytrip.com/");
		/*
		driver.findElement(By.xpath("//input[@placeholder='From']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("MUM");
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		*/
		Thread.sleep(2000);
		
//		driver.findElement(By.cssSelector("input[placeholder='From']")).click();
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
 		driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys("Lucknow");	
 		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[text()='Lucknow, India']")).click();
		Thread.sleep(10000);
        driver.findElement(By.cssSelector("input[placeholder='To']")).click();
//		driver.findElement(By.id("tocity")).click();
		Thread.sleep(2000);
		
//		Assert.assertFalse(false);
		
        driver.findElement(By.cssSelector("input[placeholder='To']")).sendKeys("Delhi");
 		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[text()='Delhi, India']")).click();
		
	//	driver.findElement(By.cssSelector(".blackText.font20.code")).click();
		driver.findElement(By.cssSelector("div[class='dateInnerCell']")).click();
		
		
	//	driver.findElement(By.xpath("//a[contains(@class,'primaryBtn.font24.latoBold.widgetSearchBtn')]")).click();;
	//	driver.findElement(By.ByCssSelector(a[class='primaryBtn font24 latoBold widgetSearchBtn '])).click();
		driver.findElement(By.cssSelector("a[class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
	}

}
