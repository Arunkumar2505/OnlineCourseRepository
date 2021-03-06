package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumTrainingPage 
{
	@FindBy (id="add")
	private WebElement plusbtn;
	
	public WebElement getPlusbtn() {
		return plusbtn;
	}

	@FindBy (xpath="//button[text()=' Add to Cart']")
	private WebElement addtocartbtn;
	
	public SeleniumTrainingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addtocartbutton()
	{
		addtocartbtn.click();
	}
	
}
