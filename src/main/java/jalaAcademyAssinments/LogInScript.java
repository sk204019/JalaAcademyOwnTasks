package jalaAcademyAssinments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInScript {

	static WebDriver driver;
	
	
	//Locators Practice
	public static void main(String[] args) throws Throwable {

		driver = new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/Home/Index");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='https://jalaacademy.com/']")).click();
		driver.findElement(By.className("dropdown-toggle p-22")).click();
	}

}
