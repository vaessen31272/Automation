package Academy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;






public class BrowserTest {

	
	/* @Test
	public void getData()
	{
		System.out.println("Hello Guys");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahylshettyacademy.azurewebsites.net/webapp/");
		String text =driver.findElement(By.cssSelector("h1")).getText();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("RahulShettyAcademy.com Learning"));
		driver.close();
	
		
		
	} */

	@Test
    public void getData() {
        System.out.println("Hello Guys");

        // Automatically downloads and sets up the correct ChromeDriver version
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://azuredemo-ecg7bnh2ddbnbggf.westeurope-01.azurewebsites.net/webapp/");
        String text = driver.findElement(By.cssSelector("h1")).getText();
        System.out.println(text);

        Assert.assertTrue(text.equalsIgnoreCase("RahulShettyAcademy.com Learning"));
        driver.quit(); // Better cleanup than close()
    }

}
