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
	@BooleanType()
	@FindBy(id = "pg:fm:pb:j_id269:j_id280:soiss_createinvoice__c")
	public WebElement soiss_createinvoice__c;
	@ButtonType()
	@FindByLabel(label = "Process Selected Lines")
	public WebElement processSelectedLines;
	@PageRow()
	public static class Table {

		@TextType()
		@FindByLabel(label = "Qty Shipped")
		public WebElement qtyShipped;
		@LinkType()
		@FindBy(xpath = "//span[contains(@id,'soship_invoice__c')]")
		public WebElement invoiceNumber;
	}
	@FindBy(id = "pg:fm:pb:j_id297:pbt:tb")
	@PageTable(firstRowContainsHeaders = false, row = Table.class)
	public List<Table> table;
	
}
