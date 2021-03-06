package assign;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);;
		//list of menu
		List<WebElement> List = driver
				.findElements(By.cssSelector("div._331-kn._2tvxW>div>div>div"));
		//size
		System.out.println("Size is:" + List.size());
		//listing
		for (WebElement Menu : List) {
			System.out.println("Menu List are:" + Menu.getText());
		}
		//Instantiating Actions class
		Actions actions = new Actions(driver);

		//Hovering on main menu
		for(int i=0; i<List.size();i++) {
			//element on which hovering is done
			WebElement hover=List.get(i);
			actions.moveToElement(hover).build().perform();
			Thread.sleep(2000);
			//driver.close();
		}
	}

}
