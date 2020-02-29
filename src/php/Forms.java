package php;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class Forms {
	WebDriver driver;
	public Forms(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;

}
	public void signup() throws InterruptedException
{
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(2000);
}
		public void create() throws InterruptedException
		{
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("gowthamimanohari898@gmail.com");
		
		driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium exclusive']")).click();
		Thread.sleep(14000);
		}
		public void gender()
		{
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		}
		public void firstname(){
		driver.findElement(By.id("customer_firstname")).sendKeys("manu");
		}
		public void lastname()		{
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("manohari");
		}
		public void password()
		{
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("manu8514");
		}
		public void days(){
		driver.findElement(By.xpath("//select[@id='days']")).sendKeys("8");
		}
		public void month()
		{
		driver.findElement(By.xpath("//select[@id='months']")).sendKeys("october");
		}
		public void years(){
		driver.findElement(By.xpath("//select[@id='years']")).sendKeys("1998");
		}
		public void firstname1(){
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("manu");
		}
		public void lastname1()
		{
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("manu");
		}
		public void address1()
		{
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("viveknanda colony");
		}
		public void address2() throws InterruptedException
		{
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("419");
		Thread.sleep(3000);
		}
		public void city()
		{
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("visakhapatnam");
		}
		public void state() throws InterruptedException{
		Select s=new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
		Thread.sleep(3000);
		s.selectByVisibleText("Indiana");
		}
		public void postcode() throws InterruptedException
		{
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("00000");
		Thread.sleep(5000);
		}
		public void phonemobile(){
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("6281619957");
		}
		public void alias() throws InterruptedException
		{
		driver.findElement(By.xpath("//input[@name='alias']")).sendKeys("vivekanada colony");
		Thread.sleep(5000);
		}
		public void button()
		{
		driver.findElement(By.xpath("//button[@name='submitAccount']")).click();
		}
		
}

		/*public void login() throws InterruptedException
		{
			
			driver.findElement(By.xpath("//a[@class='login']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gowthamimanohari8514@gmail.com");
			driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("manu8514");
			driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		}
		
}*/
