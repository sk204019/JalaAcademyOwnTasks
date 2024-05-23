package textBoxesPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//3. How to read the placeholder value of a Text Box using getAttribute() method
public class AttributeUsing {

	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/Home/Index");

		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		userName.sendKeys("training@jalaacademy.com");
		
		 String attrValue = userName.getAttribute("type");
		System.out.println(attrValue);

	}

}
