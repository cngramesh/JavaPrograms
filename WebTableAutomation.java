package LoginLogoutToAdvoKIT;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAutomation {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\EclipseWorkSpace\\Library\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.toolsqa.com/automation-practice-table/#");
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[@id='content']/table/tbody/tr[2]/td[6]")).getText();
		System.out.println(text);

		driver.quit();

	}
}
