package radioButtons_CheckBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//2. Find out number of elements in a radio group
public class TotalNumberOfRadioElements {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		driver = new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/Home/Index");


		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.name("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Employee']")).click();
		driver.findElement(By.xpath("//a[@href='/Employee/Create']")).click();

		Thread.sleep(3000);
		
	
		List<WebElement> totalRadioButtons = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
		int numberOfRadioButtons = totalRadioButtons.size();
		System.out.println(numberOfRadioButtons);
	}

}
