package SeleniumWebTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1121528\\Kousik_all data\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();//click on OK button
		//alert.dismiss();//click on cancel
		if(alert.getText().equals("Please enter a valid user name")) {
			System.out.println("COrrect alert message");
			
		}
		else {
			System.out.println("Wrong alert");
		}
		driver.quit();
		
	}

}
