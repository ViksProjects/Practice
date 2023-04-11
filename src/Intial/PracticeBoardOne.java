package Intial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeBoardOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set the path executable browser Driver
		System.setProperty("webdriver.chrome.driver", "D:\\IT_Work\\Automation\\chromedriver_win32\\chromedriver.exe");
		// .exe is not needed for other systems like linux
		
		// starting the browser
		
		WebDriver driver = new ChromeDriver();
		// webDriver is a parent = Chrome Driver is a child
		
		driver.get("https://www.google.com/"); // opening  Url
		System.out.println(driver.getTitle()); // Getting title
		driver.quit(); // closes the browser
		
		
		
	}

}
