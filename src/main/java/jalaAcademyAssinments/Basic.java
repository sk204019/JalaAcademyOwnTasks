package jalaAcademyAssinments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	static WebDriver driver;

	//Locators Practice
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/Home/Index");

		//WebElement text = driver.findElement(By.linkText("JALA Academy"));
		String text = driver.findElement(By.linkText("JALA Academy")).getText();
		System.out.println(text);
	}
}
