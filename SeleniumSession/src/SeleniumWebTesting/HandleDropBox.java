package SeleniumWebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1121528\\Kousik_all data\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Select drpCountry=new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANGOLA");
		//.deselectAll() deselct all
		//drpCountry.deselectByIndex(index); deslect by index
		//drpCountry.isMultiple() return true if dropdown alows multiple selection
		//drpCountry.selectByIndex(index); selection by index
		

	}

}
