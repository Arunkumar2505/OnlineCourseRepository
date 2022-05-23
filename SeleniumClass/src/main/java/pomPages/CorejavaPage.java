package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorejavaPage {

	@FindBy (id="image-3")
	private WebElement corejavabtn;
	

	public CorejavaPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void corejavaButton()
	{
		corejavabtn.click();
	}
	
}
