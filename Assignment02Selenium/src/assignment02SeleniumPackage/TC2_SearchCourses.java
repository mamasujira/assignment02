package assignment02SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_SearchCourses {

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
	    browserObject.findElement(By.id("user_login")).clear();;
	    browserObject.findElement(By.id("user_pass")).clear();;
		browserObject.findElement(By.id("user_login")).sendKeys(usr);
	    browserObject.findElement(By.id("user_pass")).sendKeys(pwd);
	    
	    //4
	    browserObject.findElement(By.id("wp-submit")).submit();

	    //5
	    browserObject.findElement(By.id("search_course")).sendKeys("Java");
	    
	    //6
	    //?
	    browserObject.findElement(By.xpath("/html/body/div[1]/header/div/div/div[2]/div/nav[1]/form/button")).click();
	    
	    
	}

}
