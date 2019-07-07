package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class StepActions {
	
	public static WebDriver d;
	
	@Given("^Launch browser$")
	public void launch_browser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM_PRE\\chromedriver_win32_old\\chromedriver.exe");
		d = new ChromeDriver();
	}
	
	@Given("^Enter URL$")
	public void enter_url()
	{
		d.get("http://newtours.demoaut.com/");
		d.manage().window().maximize();
	}
	
	@When("^Enter Username$")
	public void enter_username()
	{
		d.findElement(By.name("userName")).sendKeys("mercury");
	}
	@When("^Enter Password$")
	public void enter_password()
	{
		d.findElement(By.name("password")).sendKeys("mercury");
	}
	@When("^Click Submit button$")
	public void click_submit_button()
	{
		d.findElement(By.name("login")).click();
	}
	@Then("^Successful login should be displayed$")
	public void successful_login() throws InterruptedException
	{
		Thread.sleep(5000);
		String title = d.getTitle();
		System.out.println(title);
		if(title.equals("Find a Flight: Mercury Tours:"))
		{
			System.out.println("Login Success");
		}
	}
	

}
