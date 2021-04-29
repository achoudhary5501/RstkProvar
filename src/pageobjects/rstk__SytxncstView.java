package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Sytxncst View"                                
               , summary=""
               , page="SytxncstView"
               , namespacePrefix="rstk"
               , object="rstk__sytxncst__c"
               , connection="Devqaff"
     )             
public class rstk__SytxncstView {

	@LinkType()
	@FindBy(linkText = "5501-16 (Mfd)")
	public WebElement inventoryItemMaster;
	@TextType()
	@FindBy(xpath = "//span[text()='Transaction ID']/following::td[1]//span[1]")
	public WebElement transactionID;
	@TextType()
	@FindBy(xpath = "//span[text()='Transaction Qty']/following::td[1]//span[1]")
	public WebElement transactionQty;
	@TextType()
	@FindBy(xpath = "//span[text()='Quantity On Hand']/following::td[1]//span[1]")
	public WebElement quantityOnHand;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Fiscal Year')]/following::td[1]")
	public WebElement fiscalYear;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Fiscal Period')]/following::td[1]//span[1]")
	public WebElement fiscalPeriod;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Division Dimension')]/following::td[1]//span[1]")
	public WebElement divisionDimension;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Customer Dimension')]/following::td[1]//span[1]")
	public WebElement customerDimension;
	@TextType()
	@FindBy(xpath = "//td[contains(@id,'tab_Orders_lbl') and text()='Sales Orders']")
	public WebElement tab_Orders_lbl;
	@LinkType()
	@FindBy(xpath = "//th[text()='Sales Order']/following::span[contains(@id,'pbs_Orders')]//a[1]")
	public WebElement salesOrder;
	@TextType()
	@FindBy(xpath = "//span[text()='Order Type']/following::td//span[contains(@id,'pbs_Orders')][1]")
	public WebElement orderType;
	@TextType()
	@FindBy(xpath = "//span[text()='Customer']/following::td//span[contains(@id,'pbs_Orders')][1]")
	public WebElement Customer;
	
}
