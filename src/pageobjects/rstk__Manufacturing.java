package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Manufacturing"                                
               , summary=""
               , page="Manufacturing"
               , namespacePrefix="rstk"
               , object="rstk__menu__c"
               , connection="Devqaff"
     )             
public class rstk__Manufacturing {

	@LinkType()
	@FindBy(linkText = "Sales Order Entry")
	public WebElement salesOrderEntry1;
	
}
