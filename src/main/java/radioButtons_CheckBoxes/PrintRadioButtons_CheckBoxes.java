package radioButtons_CheckBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//3. Find out all radio button values
public class PrintRadioButtons_CheckBoxes {
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


		List<WebElement> totalRadioButtons = driver.findElements(By.xpath("//div[@class='col-md-12 form-group']//div"));
		int numberOfRadioButtons = totalRadioButtons.size();
		System.out.println(numberOfRadioButtons);
		for (WebElement printCheckBoxes : totalRadioButtons) {
			
			String printAll = printCheckBoxes.getText();
			System.out.println(printAll);

			
		}

	}

}
