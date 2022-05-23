package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage
{
	@FindBy (id="Selenium Training")
	private WebElement seleniumtariningbtn;
	
	@FindBy (id ="cartArea")
	private WebElement cartbtn;
	
	@FindBy (xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookbtn;
	
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void seleniumTraining()
	{
		seleniumtariningbtn.click();
	}
	public void cartButton()
	{
		cartbtn.click();
	}
	public void facebookButton()
	{
		facebookbtn.click();
	}
	
	
	public WebElement getFacebookbtn() {
		return facebookbtn;
	}

	public WebElement getSeleniumtariningbtn() {
		return seleniumtariningbtn;
	}

	public WebElement getCartbtn() {
		return cartbtn;
	}

	
}
