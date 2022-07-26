package week2.assignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sindhu300691@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Hello",Keys.TAB);//IMPORT keys
		System.out.println(driver.findElement(By.xpath("//input[@name='username']")).isDisplayed());
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		System.out.println(driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled());
		
}
}