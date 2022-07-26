package week2.assignment;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leafGroundDropDown {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement drop1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select down1 = new Select(drop1);
		down1.selectByIndex(2);

		WebElement drop2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select down2 = new Select(drop2);
		down2.selectByVisibleText("UFT/QTP");

		WebElement drop3 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select down3 = new Select(drop3);
		down3.selectByValue("4");

		//WebElement dropdownSize = driver.findElement(By.xpath("//select[@class='dropdown']"));
		//System.out.println("number of dropdown " + dropdownSize);

		// driver.findElement(By.xpath("//option[contains(text(),'sendKeys to
		// select')]")).sendKeys("1");
		// Select down5 =new Select(drop5);
		// down5.selectByIndex(2);

	}


}
