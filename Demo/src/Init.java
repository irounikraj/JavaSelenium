import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Init {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumud\\OneDrive\\Desktop\\Rubik\\chromedriver");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Rounik");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Rounik");
		//driver.findElement(By.xpath("//*[@id=\"u_0_5_e4\"]")).click();
		//driver.findElement(By.id("login")).click();
		driver.close();
		driver.quit();
		
	}

}
