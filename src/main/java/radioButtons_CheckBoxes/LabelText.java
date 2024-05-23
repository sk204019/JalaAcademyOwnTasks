package radioButtons_CheckBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//4. How to get the selected radio button label text?
public class LabelText {

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


		List<WebElement> totalRadioButtons = driver.findElements(By.xpath("//input[@type='checkbox' and @class = 'chkSkill m-r-sm']"));
		int numberOfRadioButtons = totalRadioButtons.size();
		System.out.println(numberOfRadioButtons);


		/*	

				WebElement totalRadioButtons1 = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
				totalRadioButtons1.click();
				if (totalRadioButtons1.isSelected()) {
				//WebElement label =  printCheckBoxes.findElement(By.xpath("//div[@class='col-md-12 form-group']//div[3]"));
				totalRadioButtons1.click();
				String printAll = totalRadioButtons1.getText();
				System.out.println(printAll);
		 */


		for (WebElement radioButton : totalRadioButtons) {

			WebElement label = radioButton.findElement(By.xpath("//input[@type='checkbox' and @id= 'chkSkill_1']"));
			label.click();

			if (radioButton.isSelected()) {
				WebElement labelText = radioButton.findElement(By.xpath("//div[@class='col-md-12 form-group']//div[5]"));
				String labelP = labelText.getText();
				System.out.println("Selected radio button label text: " + labelP);
				break;

			}
		}


	}
}



