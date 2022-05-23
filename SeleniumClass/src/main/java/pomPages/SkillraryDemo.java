package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemo
{
	@FindBy (xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy (xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillraryappbtn;
	
	@FindBy (name="q")
	private WebElement searchbar;
	
	@FindBy (css="input[type='submit']")
	private WebElement searchbtn;
	
	
	

	
	
	public SkillraryDemo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void gearsbutton()
	{
		gearsbtn.click();
	}
	
	public void skillraryButton()
	{
		skillraryappbtn.click();
	}
	
	public void searchBar(String text)
	{
		searchbar.sendKeys(text);
	}
	
	public void searchButton()
	{
		searchbtn.click();
	}
	
	
	
}
