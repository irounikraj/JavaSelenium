import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuugestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumud\\OneDrive\\Desktop\\Rubik\\chromedriver");
		driver.get(
				"https://www.makemytrip.com/flights/?cmp=SEM%7CM%7CDF%7CB%7CBrand%7CB_M_Makemytrip_Search_Exact%7CBrand_Top_5_Exact%7CExpanded%7C&s_kwcid=AL%211631%213%21%21e%21%21o%21%21makemytrip%5D%5C&ef_id=6d7362bf2d2c172fdf1506ef665f2846%3AG%3As&gclid=null");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label/span")).click();
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"))
				.sendKeys("Sydney");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"))
				.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();

	}

}
