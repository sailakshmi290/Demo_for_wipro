//  M.Naveen
//  writing a program to open advantage online shopping site by using implicit wait 
//  06-August-2024

package Locators;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ImplicitWait {
	WebDriver driver;

	@Test
	public void implictDemo() {

		String speakerTxt = driver.findElement(By.id("speakersTxt")).getText();
		System.out.println(speakerTxt);
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.advantageonlineshopping.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
