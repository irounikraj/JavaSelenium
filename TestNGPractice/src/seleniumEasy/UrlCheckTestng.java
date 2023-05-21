package seleniumEasy;

import java.awt.Window;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.beust.jcommander.JCommander.Builder;

@Test(priority = 1, groups = "Regression")
public class UrlCheckTestng {
	public void UrlCheckwithTest() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumud\\OneDrive\\Desktop\\Rubik\\chromedriver");
		driver.get("http://demo.seleniumeasy.com");
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println("the current url is :" + CurrentUrl);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
		// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input")).isEnabled();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input")).click();
		driver.findElement(By.xpath("//button[@id='buttoncheck']")).click();
		driver.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[4]/a[1]")).click();
		WebElement selectitem = driver.findElement(By.xpath("//select[@id='select-demo']"));

		Select sl = new Select(selectitem);
		sl.selectByValue("Thursday");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> optionlist = sl.getOptions();
		for (int i = 0; i < optionlist.size(); i++) {
			System.out.println(optionlist.get(i).getText());
		}
		System.out.println(optionlist);
		driver.findElement(
				By.xpath("//body/div[@id='easycont']/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[@id='easycont']/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]"))
				.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[7]/a[1]"))
				.click();
		driver.findElement(By.linkText("Drag and Drop")).click();
				
		WebElement draggable = driver.findElement(By.xpath("//span[contains(text(),'Draggable 1')]"));
		WebElement droppable = driver.findElement(By.id("mydropzone"));
		Actions builder =new Actions(driver);
		
		Action dragAndDrop = builder.clickAndHold(draggable).moveToElement(droppable).release(droppable).build();
	
		dragAndDrop.perform();

		Thread.sleep(2000);

		//driver.close();
	}
}
