package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerdemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		String month="february 2023";
		String date="23";
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver107new.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("checkin")).click();
		
		Thread.sleep(5000);
		
		while(true) {
			String text=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table")).getText();
			
			if(text.equals(month)) {
				break;
				
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/thead/tr[1]/th[3]/i")).click();
			}

		}


	}

}
