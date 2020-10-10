import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Selenium Code -
		
		// Create Driver Object for chosen Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gangesh_kr\\chromedriver_win32\\chromedriver.exe"
);
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();     // ===> To Maximise the window
//		driver.get("http://google.com");
//		System.out.println(driver.getTitle());		 // get page title
//		System.out.println(driver.getCurrentUrl());	 // get Current URL
//		System.out.println(driver.getPageSource());  // get page Source
//		driver.get("http://yahoo.com");
//		driver.navigate().back();                   // navigate back to google 
//		driver.close();                             // close current window
//		driver.quit();                              // close all widows including child windows
//		driver.get("http://facebook.com");
//		driver.findElement(By.id("email")).sendKeys("This is Gangesh Singh");
//		driver.findElement(By.name("pass")).sendKeys("abcde12345");
//		driver.findElement(By.linkText("Forgotten account?")).click();
//		driver.findElement(By.partialLinkText("Forgotten acc")).click();
//
//-------------------------------------------------------------------------------------		
//      Every object may not have ID, Class Name, or name so -Xpath or CSS Prferred
//		Alpha numeric id may vary on every refresh - Please check before using it.
//		Confirm the link object with anchor "a" tag
//		Class name should not have spaces - It gives error 'Compound Classes not permitted'
//		Multiple values - Selenium identifies the first one - scans from top left
//		When XPATH starts with HTML it is not reliable		
//		Double quotes inside double quotes is not accepted, change it to single quote	
//      //tagName[@attribute='value'] - Xpath Syntax
//		//*[@attribute='value']       = Xpath Syntax looking at all tags for the attribute
//      tagName[attribute='value']    - CSS 
//      $x("")  - Validate Xpath in console
//		$("")   - Validate CSS in console
//		tagName#id                  - CSS
//		tagName.classname			- CSS (If spaces are there in class name then use . instead of spaces)
//      tagName[contains(@attribute,'value'] --> Regular expressions for xpath
//		tagName[Attribute*='value']          --> Regular expression for CSS
//      TestNG is for tesing framework
//		Protractor ==> Angular Automation tool ==> Type script based.
//		Assert.assertFalse(false);  ==> To check if the statement returns false then pass the test
//		Assert.assertTrue(True);  ==> To check  if the statement returns true then pass the test
//		Assert.assertFalse(Ture);  ==> To assert if the statement returns true then fail the test (it is expecting false)
//		Assert.assertEquals(actual, expected); ==> To check if Assert equals
//		Control + Shift + 'F' ==> To format code in Eclipse
//
//=========================  ALERT ================================		
//		driver.switchTo().alert(); ==> to switch to alert mode
//		driver.switchTo().alert().accept(); ==> to accept the alert
//		driver.switchTo().alert().dismiss(); ==> to dismiss the alert
//		driver.switchTo().alert().getText(); ==> to get the alert text
		
/*========== Debug code in Eclipse ===============================
		Rightclick and Togglebreakpoint 
		Run - Debug as
		Stepover (F6) next step
		Don't stop ==> till next breakpoint
/*================== Actions Class (for Mouse Movements) ======================  
    driver.get("https://www.amazon.com/"); 	
    Actions a= new Actions(driver);     										<== Pass the driver to Actions object
    a.moveToElement(driver.findElement(By.id("    "))).build().perform(); 		<== Object.Actions required  .Build  . Perform
------------------------------------------------------------------------------------ */		
/* --------------------   FRAMES - Lecture 89 ------------------------------------------- 
		driver.findElements(By.tagName("iframe")).size();    // to find the number of frames present in code
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='Name']")));  // Select the frame
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();         // drag and drop
		driver.switchTo().defaultContent()                       // to leave the frame          		
*/            		
//		driver.get("http://rediff.com");
//		driver.findElement(By.cssSelector("a[title*='Sign in']")).click(); 
// 		driver.findElement(By.name("login")).sendKeys("This is Gangesh Singh");
// 		driver.findElement(By.name("passwd")).sendKeys("abcde12345");
//	    driver.findElement(By.name("proceed")).click();
//      driver.findElement(By.cssSelector("input#login1")).sendKeys("GKS");
//		driver.findElement(By.cssSelector("input#password")).sendKeys("passwrd");
//		driver.findElement(By.cssSelector("input.signinbtn")).click();	
		
//		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("GKS");
//		driver.findElement(By.xpath("//*[@name='passwd']")).sendKeys("PASS");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//
// ------ Search for CORNOA on Google -------------------		
/*		driver.get("http://google.com");
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("CORONA");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		driver.findElement(By.xpath("//div[@class='r']/a/div/cite")).click();
*/		
// -------  Mouse Movements using Action --------------------------------		
		driver.get("http://www.amazon.co.uk");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
//		WebElement move=driver.findElement(By.id("nav-link-accountList"));
		
		
			
//		a.moveToElement(By.id("nav-link-accountList"));		
	}

}
