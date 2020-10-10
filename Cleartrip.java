import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cleartrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gangesh_kr\\chromedriver_win32\\chromedriver.exe"
);
		WebDriver driver=new ChromeDriver();
		
/*		This is for Test Practice site	*/ 
		driver.get("https://www.cleartrip.com/");	

//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
// 		Thread.sleep(1000);
	
		driver.findElement(By.id("Depart	Date")).click();
 		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[1]/td[7]/a")).click();
		
 		driver.findElement(By.id("Adults")).click();
		Select s1 = new Select(driver.findElement(By.id("Adults")));
		s1.selectByValue("3");
		
		Thread.sleep(500);
		
		driver.findElement(By.id("Childrens")).click(); 		Select s2 = new Select(driver.findElement(By.id("Childrens")));
 		s2.selectByValue("2");
 		
//		Thread.sleep(500); 		
 		
  		driver.findElement(By.xpath("//*[@id='MoreOptionsLink']/strong")).click();
  		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Air India (AI)");
		
		
	}

}
