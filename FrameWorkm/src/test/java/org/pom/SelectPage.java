package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage extends BaseClass {

	public SelectPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radioButton;
	@FindBy(id = "continue")
	private WebElement clickcontinue;

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getClickcontinue() {
		return clickcontinue;
	}

}
