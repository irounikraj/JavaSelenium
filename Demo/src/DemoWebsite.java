import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebsite {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumud\\OneDrive\\Desktop\\Rubik\\chromedriver");
		driver.get(null);
		driver.manage().window().maximize();
		

	}

}
