package php;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Loginn {
	WebDriver driver;
	public Loginn(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void open() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("automationpractice.com");
		Actions a=new Actions(driver);
		for(int i=0;i<1;i++)
		{
			Thread.sleep(3000);
			a.sendKeys(Keys.DOWN).build().perform();
			
		}
		
		  a.sendKeys(Keys.ENTER).build().perform();
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > div.r > a > h3")).click();
		  Thread.sleep(2000);
	}
	public void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(5000);
	}
	public void mail() throws InterruptedException
	{		
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gowthamimanohari8514@gmail.com");
	Thread.sleep(1000);
	}
	public void passwd()
	{
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("manu8514");
	}
	public void submitlogin()
	{
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	}
	/*public void women()
	{
		driver.findElement(By.xpath("//a[@class='sf-with-ul']")).click();
	}
	
	public void search()
	{
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("dresses");
	}*/
	public void element() throws InterruptedException{	
		Actions a=new Actions(driver);
		WebElement d =driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a"));
		a.moveToElement(d).click().build().perform();
		Thread.sleep(5000);
	}
		public void casual() throws InterruptedException
		{
		WebElement c=driver.findElement(By.xpath("//*[@id='subcategories']/ul/li[1]/div[1]/a"));
		Actions a = new Actions(driver);
		a.moveToElement(c).click().build().perform();
		Thread.sleep(3000);
		}
		public void sort() throws InterruptedException
		{
			Select s = new Select(driver.findElement(By.xpath("//select[@id='selectProductSort']")));
			s.selectByVisibleText("Product Name: A to Z");
			Thread.sleep(2000);
		}
		public void list() throws InterruptedException
		{
			driver.findElement(By.xpath("//li[@id='list']")).click();
			Thread.sleep(2000);
		}
		public void length() throws InterruptedException
		{
		driver.findElement(By.xpath("//input[@name='layered_id_attribute_group_3']")).click();
		Thread.sleep(1000);
		
		}
		public void slider() throws InterruptedException
		{
			Actions a=new Actions(driver);
			WebElement slider=driver.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
			a.dragAndDropBy(slider, 65, 0).build().perform();
			Thread.sleep(7000);
		}
		
		public void cart() throws InterruptedException
		{
			driver.findElement(By.xpath("//a[@class ='button ajax_add_to_cart_button btn btn-default']")).click();
			//driver.findElement(By.cssSelector("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")).click();
			Thread.sleep(5000);
			//Actions a=new Actions(driver);
			//a.moveToElement(b).click().build().perform();
		}
		public void proceed() throws InterruptedException
		{
			driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
			Thread.sleep(2000);
			
		}
		public void summary() throws InterruptedException
		{
			driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
			Thread.sleep(2000);
		}
		public void add() throws InterruptedException
		{
			driver.findElement(By.xpath("//button[@name='processAddress']")).click();
			Thread.sleep(3000);
			
		}
		public void ship() throws InterruptedException
		{
			driver.findElement(By.xpath("//input[@name='cgv']")).click();
			driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
			Thread.sleep(2000);
		}
		//Select s = new Select (driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a")));
		//s.selectByVisibleText("Casual Dresses");
		
		
	}
		  
	


