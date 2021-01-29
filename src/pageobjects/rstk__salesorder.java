package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__salesorder"                                
               , summary=""
               , page="SalesOrder"
               , namespacePrefix="rstk"
               , object="rstk__sohdr__c"
               , connection="Devqaff"
     )             
public class rstk__salesorder {

	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='Sales Order']")
	public WebElement pageTitle;
	@TextType()
	@FindBy(id = "pg:fm:pb:j_id1032:j_id1033:sohdr_order__c")
	public WebElement orderNumber;
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'sohdr_custno__c')]")
	public WebElement Customer;
	@TextType()
	@FindBy(id = "li-0")
	public WebElement Customer_Select;
	@PageTable(row = LineItems.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@id='pbt_lineitems']")
	public List<LineItems> lineItems;
	@PageRow(byColumn = true)
	public static class LineItems {

		@TextType()
		@VisualforceBy(componentXPath = "apex:inputText[@id='soline_textproduct__c']")
		public WebElement product;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@id='soline_qtyorder__c']")
		public WebElement qtyOrdered;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@id='soline_price__c']")
		public WebElement unitPrice;
		@BooleanType()
		@VisualforceBy(componentXPath = "apex:inputField[@id='soline_firm__c']")
		public WebElement firm;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@id='soline_linestatustext__c']")
		public WebElement firm1;
	}
	@TextType()
	@FindBy(id = "li-0")
	public WebElement Product_Select;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='Sales Order - SO-Jan21-1']")
	public WebElement pageTitle1;
	@ButtonType()
	@FindByLabel(label = "Order Fulfillment")
	public WebElement orderFulfillment;
	
}
