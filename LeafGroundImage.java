package week2.assignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LeafGroundImage {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Click on this image to go home page
		driver.findElement(By.xpath("(//label[contains(text(),'Click on this image')])/following::img")).click();
		driver.navigate().to("http://leafground.com/pages/Image.html");
        
}
}