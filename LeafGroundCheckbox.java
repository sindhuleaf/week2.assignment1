package week2.assignment;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckbox {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// To select one particular CheckBox
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		// To Confirm Selenium is checked/selected
		System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected());

	}
}
