package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserTest {

	//public static void main(String[] args) {
	
	@Test
	public void browserTest() {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/");
driver.manage().window().maximize();

	}

}
