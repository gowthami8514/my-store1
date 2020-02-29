package travels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import php.Loginn;

public class Loginnn2 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.google.co.in/");
		Loginn l =new Loginn(driver);
		l.open();
		l.login();
		Thread.sleep(3000);
		l.mail();
		l.passwd();
		l.submitlogin();    
		//l.women();http://automationpractice.com/index.php
		//l.list();
		//l.search();
		l.element();
		l.casual();
		Thread.sleep(5000);
		l.sort();
		l.list();
		l.length();
		l.slider();
		Thread.sleep(1000);
		l.cart();
		l.proceed();
		Thread.sleep(1000);
		l.summary();
		l.add();
		l.ship();
		

	}

}
