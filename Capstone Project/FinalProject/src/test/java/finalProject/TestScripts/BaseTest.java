package finalProject.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;

	@BeforeTest
	public void LaunchApplication() {
		// 1. Open the browser
		driver = new EdgeDriver();

		// 2. Maximize it
		driver.manage().window().maximize();

		// 3. Navigate to http://localhost:9010
		driver.get("http://localhost:9010");
	}

	// Close the browser
	@AfterTest
	public void CloseBrowser() {
		driver.quit();

	}
}
