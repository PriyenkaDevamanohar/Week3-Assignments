package SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement searchbox = driver
				.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
		searchbox.click();
		searchbox.sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='facet-linkhead']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='facet-linkhead'])[4]")).click();
		String count = driver.findElement(By.xpath("//div[@class='length']")).getText();

		System.out.println(count);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='facet-left-pane-label'])[4]")).click();

		System.out.println("Brands of the bag");
		List<WebElement> brandname = driver.findElements(By.xpath("(//div[@class='facet-body'])[3]"));
		System.out.println(brandname.size());
		for (WebElement brand : brandname) {
			String text = brand.getText();
			System.out.println(text);
		}

		System.out.println("Names of the Bag");
		List<WebElement> bagname = driver.findElements(By.className("nameCls"));
		System.out.println(bagname.size());
		for (WebElement webElement : bagname) {

			String text = webElement.getText();
			System.out.println(text);
		}

	}

}
