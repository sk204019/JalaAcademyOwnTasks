package textBoxesPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Check if Text Box is enabled/disabled
public class TexBoxStatusEnable_Disable {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/Home/Index");

		WebElement userName = driver.findElement(By.id("UserName"));
		userName.isEnabled();
		System.out.println(userName.isEnabled());
	}

}
