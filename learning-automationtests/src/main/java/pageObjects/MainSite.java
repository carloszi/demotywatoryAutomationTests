package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainSite {
	
	@FindBy(id="first")
	protected WebElement mainButton;
	
	@FindBy(xpath = "//*[@id=\'main-menu\']/li[2]/a")
	protected WebElement waitingRoomButton;
	
	@FindBy(xpath = "//*[@id='main-menu']/li[3]/a")
	protected WebElement recomendedButton;	
}
