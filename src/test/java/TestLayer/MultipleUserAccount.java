package TestLayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import UtilsLayer.ExcelReader;

public class MultipleUserAccount extends BaseClass{
	
	String employeeId;

	@BeforeClass
	public void setUp() {
		BaseClass.Initialization();
	}
	
	@Test(priority=1)
	public void loginFunctionality() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Test(priority=2)
	public void validateHomePageTitle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@Test(priority=3,dataProvider="createUser")
	public void createMultiPleUser(String fName,String mName,String lName) {
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.name("firstName")).sendKeys(fName);
		driver.findElement(By.id("middleName")).sendKeys(mName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
	    employeeId=driver.findElement(By.id("employeeId")).getAttribute("value");
	    driver.findElement(By.id("btnSave")).click();
	    
	    driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
	    driver.findElement(By.id("empsearch_id")).sendKeys(employeeId);
	    driver.findElement(By.id("searchBtn")).click();
	    driver.findElement(By.xpath("//table[@id='resultTable']//td[1]")).click();
	    driver.findElement(By.id("btnDelete")).click();
	    driver.findElement(By.id("dialogDeleteBtn")).click();
	}
	
	@DataProvider(name="createUser")
	public Object[][] getData(){
		ExcelReader excelReader=new ExcelReader("F:\\pratiksha new notes\\new file.xlsx");
		int row=excelReader.countTotleRows(1);
		int column=excelReader.countTotleColumn(1);
		int rows=row+1;
		Object[][] data=new Object[rows][column];
		for(int i=0;i<rows;i++)
		{
			data[i][0]=excelReader.getDataFromExcel(1, i, 0);
			data[i][1]=excelReader.getDataFromExcel(1, i, 1);
			data[i][2]=excelReader.getDataFromExcel(1, i, 2);
	
		}
		return data;
	}	
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}
