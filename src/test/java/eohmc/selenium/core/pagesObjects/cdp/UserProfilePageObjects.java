/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eohmc.selenium.core.pagesObjects.cdp;

import eohmc.selenium.core.helperClasses.BaseClassHelper;
import static eohmc.selenium.core.helperClasses.BaseClassHelper.driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
/**
 *
 * @author KhutheleM
 */
public class UserProfilePageObjects extends BaseClassHelper
{
	//Declare Objects
    //To perform web action
    Actions actions = new Actions(driver);

    //Create a Constructor to initialize objects
    public UserProfilePageObjects(WebDriver localDriver)
    {
        PageFactory.initElements(localDriver, this);
        driver = localDriver;
    }

    //All WebElements are identified by @FindBy annotation
    @FindBy(how = How.XPATH,using = "//td/a[text()='Edit']") WebElement editButton;
    @FindBy(how = How.ID,using = "saveDetails")  WebElement saveButton;
   
    //Wait for the edit button
    public boolean isEditButtonDisplayed()
    {
       return editButton.isDisplayed();
    }

	//Click edit button
	public void clickEditButton()
    {
       editButton.click();
    }
	
    //wait for Next button
    public boolean IsSaveButtonDisplayed()
    {
      return saveButton.isDisplayed();
    }
}
