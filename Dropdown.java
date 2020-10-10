import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
	
public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// This is for test Static Dropdown with Select clause.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gangesh_kr\\chromedriver_win32\\chromedriver.exe"
);
		WebDriver driver=new ChromeDriver();
 
/*		
//		This is for Tickets to India	
		driver.get("https://www.ticketstoindia.co.uk/");
  
  		Select s = new Select(driver.findElement(By.id("FDestFrom")));
		s.selectByVisibleText("London Heathrow");
		
		driver.findElement(By.id("FDestTo")).sendKeys("Lucknow (LKO) :IN");

//		driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div[2]/table/tbody/tr[5]/td[4]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div[1]/table/tbody/tr[4]/td[4]/a")).click();	
		
		Select sel = new Select(driver.findElement(By.id("FAdult")));
		sel.selectByValue("2");
		sel.selectByIndex(5);
//		sel.deselectAll();
		sel.selectByVisibleText("2");
		
		Select s1 = new Select(driver.findElement(By.id("FAirLine")));
		s1.selectByValue("AI");
		
		driver.findElement(By.id("FlexID")).click();
		
//			driver.findElement(By.id("FDptDateDDMMYY")).sendKeys("05-MAY-2020");
//			driver.findElement(By.id("FRetDateDDMMYY")).sendKeys("05-JUL-2020");
		driver.findElement(By.id("imgSearch12")).click();
*/ 		
		// for spice jet 

		driver.get("https://www.spicejet.com/");
		
//      Select the number of passengers (04) 		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
			s1.selectByValue("4");

//      Select the from Destination 				
 				driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
 				Thread.sleep(2000);
 				driver.findElement(By.xpath("//a[@value='GOP']")).click();
//      		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOP']")).click();
//				Thread.sleep(2000);
				driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//				Thread.sleep(2000); 
//     Select the to Destinagtion  for 'JAI' using index -----------------------------				
 				driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();  
//				driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']"));
	
 //             Select Date of 29th April				
 //				driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']")).click();
 //  				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[4]/a")).click();
 				driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
 				
 				
 //				Click on Search				
 //				driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
 //				driver.findElement(By.cssSelector("input.'ctl00_mainContent_btn_FindFlights'")).click();;
 				driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
 //				driver.findElement(By.cssSelector("a.primaryBtn.font24.latoBold.widgetSearchBtn")).click();;
 				
	}

}
