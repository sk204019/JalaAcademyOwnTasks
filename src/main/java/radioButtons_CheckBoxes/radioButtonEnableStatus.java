package radioButtons_CheckBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//6. Check if Radio Button is enabled or disabled?
public class radioButtonEnableStatus {
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


		WebElement radio = driver.findElement(By.xpath("//input[@type='checkbox' and @id= 'chkSkill_1']"));
		boolean status = radio.isEnabled();
		System.out.println(status);
	}
}
