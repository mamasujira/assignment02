package assignment02SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_Payment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver browserObject = new ChromeDriver();

		String url = "http://demo.itlearn360.com/";
	    String usr = "Demo12";
	    String pwd = "Test123456$";

		//1
		browserObject.get(url);

		//2
		browserObject.findElement(By.id("loginlabel")).click();
		Thread.sleep(3000);

		//3
	    browserObject.findElement(By.id("user_login")).sendKeys(usr);
	    browserObject.findElement(By.id("user_pass")).sendKeys(pwd);
	    
	    //4
	    browserObject.findElement(By.id("wp-submit")).submit();

	    //5
	    browserObject.findElement(By.xpath("/html/body/div[1]/header/div/div/div[2]/div/nav[2]/ul/li[1]/a")).click();
	    	    
	    //6
	    //?
	    
	    //7 Must maximize window
		browserObject.manage().window().maximize();
	    browserObject.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div/main/article/div/div[1]/div/div[1]/ul/li[3]/a")).click();
	    
	    //8 Must scroll down
		JavascriptExecutor js1 = (JavascriptExecutor) browserObject;
		js1.executeScript("window.scrollBy(0,250)", "");    
	    browserObject.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    
	    //9 Must scroll down
		JavascriptExecutor js2 = (JavascriptExecutor) browserObject;
		js2.executeScript("window.scrollBy(0,250)", "");    
//??	    browserObject.findElement(By.xpath("//input[@value='stripe']")).click();
		browserObject.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div/main/article/div/div/div[1]/div/form/div/div[1]/ul/li/label")).click();
	    
	    //10
		JavascriptExecutor js3 = (JavascriptExecutor) browserObject;
		js3.executeScript("window.scrollBy(0,250)", "");    
		browserObject.findElement(By.id("learn-press-checkout-place-order")).click();
		
		//11
		browserObject.findElement(By.name("cardnumber")).sendKeys("12341231234");
		
		//12
		browserObject.findElement(By.name("exp-date")).sendKeys("1212");
		
		//13
		browserObject.findElement(By.name("cvc")).sendKeys("345");
		
		//14
		browserObject.findElement(By.id("payment-button")).click();
		
		//15
		browserObject.close();
		
	}

}
