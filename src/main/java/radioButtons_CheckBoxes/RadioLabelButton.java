package radioButtons_CheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//1. Selecting the Radio Button by Label Text / value
public class RadioLabelButton {
	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		driver = new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/Home/Index");

		//span[@class='checkmark']
		driver.findElement(By.xpath("//span[@class='checkmark']"));
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.name("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();

		//a[normalize-space()='Employee']
		//a[normalize-space()='Create']
		//*[@id="MenusDashboard"]/li[2]/a/text()
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Employee']")).click();
		driver.findElement(By.xpath("//a[@href='/Employee/Create']")).click();
		
		
		driver.findElement(By.id("chkSkill_1")).click();
	}
}