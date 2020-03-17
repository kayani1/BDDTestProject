package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinfeature {
	
	@FindBy(xpath="//a[.='REGISTER']")
	private WebElement regbtn;
	
	@FindBy(name="firstName")
	private WebElement fnametbx;
	
	@FindBy(name="lastName")
	private WebElement lnametbx;
		
	@FindBy(name="phone")
	private WebElement phonetbx;
	
	@FindBy(id="userName")
	private WebElement emailtbx;
	
	@FindBy(name="address1")
	private WebElement adresstbx;
	
	@FindBy(name="city")
	private WebElement citytbx ;
	
	@FindBy(name="state")
	private WebElement statetbx;
	
	@FindBy(name="postalCode")
	private WebElement pcodetbx;
	
	@FindBy(id="email")
	private WebElement unametbx;
	
	@FindBy(name="password")
	private WebElement passwordtbx;
	
	@FindBy(name="confirmPassword")
	private WebElement conpasstbx;
	
	@FindBy(xpath="//input[@name='register']")
	private WebElement submitbtn;
	
	public Signinfeature (WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void register()
	{
		
		regbtn.click();
		
	}
	
	
	public void contactinfo(String fname, String lname, String phone, String email)
	{
		fnametbx.sendKeys(fname);
		lnametbx.sendKeys(lname);
		phonetbx.sendKeys(phone);
		emailtbx.sendKeys(email);
		
	}
	
	public void mailinginfo(String adress, String city,String state, String pcode)
	{
		adresstbx.sendKeys(adress);
		citytbx.sendKeys(city);
		statetbx.sendKeys(state);
		pcodetbx.sendKeys(pcode);
			
	}
	
	public void userinfo(String uname,String password,String conpass)
	{
		unametbx.sendKeys(uname);
		passwordtbx.sendKeys(password);
		conpasstbx.sendKeys(conpass);
		submitbtn.click();
	}
	

}
