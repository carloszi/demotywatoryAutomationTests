package testingActions;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class TestMainSite extends MainSite {
	
	
	public void clickOnMainButton(WebDriver driver) {
		mainButton.click();
	}

	public void clickOnWaitingRoomButton(WebDriver driver) {
		waitingRoomButton.click();
	}

	public void clickOnRecomendedButton(WebDriver driver) {
		recomendedButton.click();
	}
}
