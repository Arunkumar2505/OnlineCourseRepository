package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.CorejavaPage;
import pomPages.SkillraryDemo;
import pomPages.WishlistPage;

public class TestCase3 extends BaseClass
{
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryDemo sd=new SkillraryDemo(driver);
		sd.searchBar(p.getPropertyFileData("searchValue"));
		sd.searchButton();
		
		
		CorejavaPage cp=new CorejavaPage(driver);
		cp.corejavaButton();
		
		WishlistPage wp=new WishlistPage(driver);
		driverUtilities.switchFrames(driver);
		wp.playButton();
		Thread.sleep(5000);
		wp.pauseButton();
		driverUtilities.switchbackFrames(driver);
		wp.addtowishlistButton();
		
		
		
		
	}
	
}
