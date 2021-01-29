package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Sales Order Workbench"                                
               , summary=""
               , page="SalesOrderWorkBench"
               , namespacePrefix="rstk"
               , object="rstk__sohdr__c"
               , connection="Devqaff"
     )             
public class rstk__SalesOrderWorkbench {

	@TextType()
	@VisualforceBy(componentXPath = "c:standardHeader//h2[contains(@class, \"pageDescription\")]")
	public WebElement pageTitle;
	
}
