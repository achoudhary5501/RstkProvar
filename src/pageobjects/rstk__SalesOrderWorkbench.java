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
//	@PageRow()
//	public static class Table {
//
//		@TextType()
//		@FindByLabel(label = "Qty Shipped")
//		public WebElement qtyShipped;
//		@LinkType()
//		@FindBy(xpath = "//span[contains(@id,'soship_invoice__c')]")
//		public WebElement invoiceNumber;
//		@TextType()
//		@FindByLabel(label = "Qty Shipped")
//		public WebElement qtyShipped1;
//		@TextType()
//		@FindBy(xpath = "//td[contains(@id,'soship_qtyship__c')]//span[1]")
//		public WebElement qtyShipped2;
//	}
//	@FindBy(id = "pg:fm:pb:j_id297:pbt:tb")
//	@PageTable(firstRowContainsHeaders = false, row = Table.class)
//	public List<Table> table;
	@PageRow()
	public static class Table {

		@TextType()
		@FindBy(xpath="//div[text()='Qty Shipped']/following::tbody//tr[1]//td[14]//span")
		public WebElement qtyShipped;
		@LinkType()
		@JavascriptBy(jspath = "return document.querySelector('td:nth-child(17) > span > a')")
		public WebElement invoiceNumber;
		
	}
	@FindBy(id = "pg:fm:pb:j_id297:pbt:tb")
	@PageTable(firstRowContainsHeaders = false, row = Table.class)
	public List<Table> table;
	
	
	
	//Custom Table
	
	/*@PageRow()
	public static class SalesOrderFullfillment_Table {


		@TextType()
		@FindBy(xpath = ".//td[3]")
		public WebElement SalesOrder;
		
		@FindBy(xpath = ".//td[14]/span")
		public WebElement QtyShipped;
		
		@FindBy(xpath = ".//td[17]")
		public WebElement Invoice;
		
		
	}
	@FindBy(xpath="//table[contains(@id,'pg:fm:pb:j_id297:pbt')]/tbody/tr")
	@PageTable(firstRowContainsHeaders = false, row = SalesOrderFullfillment_Table.class)
	public List<SalesOrderFullfillment_Table> SalesOrderFullfillment_Table;
	*/
	
	//custome table search criteria
	
	
}
