package textBoxesPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//4. Deleting/clear text from the Text Box
public class ClearOperationOnTextBox {
	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		driver = new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/Home/Index");

		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		userName.sendKeys("training@jalaacademy.com");
		Thread.sleep(2000);		
		userName.clear();

	}
}
