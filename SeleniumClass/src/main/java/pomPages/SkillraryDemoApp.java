package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApp
{

	@FindBy (xpath="//a[text()='COURSE']")
	private WebElement coursebtn;
	
	public WebElement getCoursebtn() {
		return coursebtn;
	}
	
	@FindBy (name="addresstype")
	private WebElement dropdowndbtn;

	public WebElement getDropdowndbtn() {
		return dropdowndbtn;
	}
	

	@FindBy (xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtrainingbtn;
	
	public SkillraryDemoApp(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void seleniumTrainingButton()
	{
		seleniumtrainingbtn.click();
	}
	
	
}
