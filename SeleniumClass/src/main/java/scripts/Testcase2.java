package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import genericLibrary.PropertyFile;
import pomPages.SkillraryDemo;
import pomPages.SkillraryDemoApp;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass 
{   
	@Test
	public void tc2() throws IOException
	{
		SkillraryDemo s= new SkillraryDemo(driver);
		s.gearsbutton();
		s.skillraryButton();
		
		SkillraryDemoApp  sa=new SkillraryDemoApp(driver);
		driverUtilities.switchTabs(driver);
		driverUtilities.dropDown( sa.getDropdowndbtn(),p.getPropertyFileData("value"));
		
		TestingPage tp=new TestingPage(driver);
		driverUtilities.dragDrop(driver, tp.getSeleniumtariningbtn(),tp.getCartbtn());
		
		Point l = tp.getFacebookbtn().getLocation();
		int x = l.getX();
		int y = l.getY();
		driverUtilities.scrollBar(driver, x, y);
		tp.facebookButton();
	}
	
	
}
