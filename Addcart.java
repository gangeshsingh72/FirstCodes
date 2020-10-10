import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub - 71 Code Download

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// array of items to be added to cart
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver, itemsNeeded);

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		// Select all Products with the CSS nd load it into List products
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{

			// Get the name and split it. (Name is displayed as "CUCUMBER - 1 KG"
			String[] name = products.get(i).getText().split("-");

			// Name is split as "CUCUMBER " and " KG"
			// Remove the spaces from index[0] i.e. "Cucumber " 
			String formattedName = name[0].trim();

// format it to get actual vegetable name
// convert array into array list for easy search
// check whether name you extracted is present in arrayList or not-

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {

				j++;
				// Click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				// Compare with length of array
				if (j == itemsNeeded.length) {
					break;
				}

			}
		}
	}

}