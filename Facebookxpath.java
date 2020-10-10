import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Driver Object for chosen Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gangesh_kr\\chromedriver_win32\\chromedriver.exe"
);
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());		 // get page title
		System.out.println(driver.getCurrentUrl());	 // get Current URL
		driver.get("http://facebook.com");
//		driver.findElement(By.id("email")).sendKeys("This is Gangesh Singh");
//		driver.findElement(By.name("pass")).sendKeys("abcde12345");
//		driver.findElement(By.linkText("Forgotten account?")).click();
		
/*      Testing CSS SELETOR	*/	
//		driver.findElement(By.cssSelector("input[@type='email']")).sendKeys("GKS");
//		driver.findElement(By.cssSelector("input[@type='password']")).sendKeys("PPP");
//		driver.findElement(By.cssSelector("inupt[@type='submit']")).click();	

/*      Testing XPATH	*/	
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("GKS");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("GKS");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
//-------------------------------------------------------------------------------------		
//      Every object may not have ID, Class Name, or name so -Xpath or CSS Prferred
//		Alpha numeric id may vary on every refresh - Please check before using it.
//		Confirm the link object with anchor "a" tag
//		Class name should not have spaces - It gives error
//		Multiple values - Selenium identifies the first one - scans from top left
//		Double quotes inside double quotes is not accepted, change it to single quote	
//      //tagName[@attribute='value'] - Xpath Syntax
//      $x("")  - Validate Xpath
//		tagName[@attribute='value'] - CSS
//		tagName#id                  - CSS
//------------------------------------------------------------------------------------		

		
		
		
		
		
	}

}
