package JavaClass;

import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeJava {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leaftaps.com/opentaps/control/main");
	

}
