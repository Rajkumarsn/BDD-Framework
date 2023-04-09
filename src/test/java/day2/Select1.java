package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		Thread.sleep(5000);
		driver.findElement(By.id("btn-login")).click();
		Thread.sleep(5000);
		WebElement dropdown = driver.findElement(By.id("combo_facility"));
		Select sc = new Select(dropdown);
		sc.selectByVisibleText("Hongkong CURA Healthcare Center");
		Thread.sleep(5000);
	}

}
