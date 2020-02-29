package travels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import php.Forms;

public class Forms2 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://automationpractice.com/index.php");
		Forms f =new Forms(driver);
		f.signup();
		f.create ();
		f.gender();
		f.firstname();
		f.lastname();
		f.password();
		f.days();
		f.month();
		f.years();
		f.firstname1();
		f.lastname1();
		f.address1();
		f.address2();
		f.city();
		f.state();
		f.postcode();
		f.phonemobile();
		f.alias();
		f.button();
		Thread.sleep(7000);

	}

}
