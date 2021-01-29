package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="Devqaff"
     )             
public class MyPageObject {

	@TextType()
	@FindBy(xpath = "//input[@placeholder='Search apps and items...']")
	public WebElement searchAppsAndItems;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Sales Order Header']")
	public WebElement SalesOrderHeader;
			
}
