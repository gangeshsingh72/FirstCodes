import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Rahulshetty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gangesh_kr\\chromedriver_win32\\chromedriver.exe"
);
		WebDriver driver=new ChromeDriver();
		
/*		This is for Test Practice site	*/ 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
		Assert.assertFalse(false, "driver.findElement(By.id('checkBoxOption1'))");

//		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
//		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		Assert.assertTrue(true, "driver.findElement(By.id('checkBoxOption1'))");
//		driver.findElements(By.cssSelector(input[@type="checkbox"]));
//      Count the number of check boxes on the page and display on console 
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

//      Count the number of check boxes using automated Assert 
	Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 3);
		
	}

}
