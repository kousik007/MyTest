package SeleniumWebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {

	public static void main(String[] args) {
		//browser launch
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1121528\\Kousik_all data\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//enter url
		driver.get("http://google.com");
		//get title
		System.out.println("Titele is "+driver.getTitle());
		if(driver.getTitle().equals("Google")) {
			System.out.println("Correct Page");
		}
		//validation point
		else {
			System.out.println("incorrect page");
		}
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.quit();

	}

}
