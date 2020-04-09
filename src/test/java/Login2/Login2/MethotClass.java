package Login2.Login2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

public class MethotClass 
{

	static String excel_url,s1,LicenseVersion,s3,s4,s5,zap_provider_name,campaign_id1,server_output,excel_user,campaign_user,campaign_state,sip_name,gateway_Interface,disposition_name,list_name,Source_Lead_name;
    static int state, Feature_Details_agents,SIP_Extensions,agent_id,group_id,campaign_id,camp_count,agent_coun,list_count,sip_count,gateway_count,list_id,source_count;
    public static int flag=0;
    public static  WebDriver driver;
    public static   FileInputStream f2;
    public static   HSSFWorkbook Hw;
    public static   HSSFSheet Hs;
    public static  SoftAssert assertion= new SoftAssert();
	public static void openBrowser() throws IOException 
	{
		System.out.println("browser open method is start");
		System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver");
		System.out.println("open fire fox browser ");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println(" collect url from excel sheet");
		f2=new FileInputStream("/home/himanshu/eclipse-workspace/Login2/TestData/Czentrix_data.xls");
        Hw=new HSSFWorkbook(f2);
	    Hs=Hw.getSheet("Sheet3");
	    excel_url=Hs.getRow(1).getCell(0).getStringCellValue();
		System.out.println(excel_url);
//		Hw.close();
	    driver.get("http://"+excel_url+"/");
	   // screen(driver, "Browser start");
		 System.out.println("check url assertion");
		 String Actualurl = driver.getCurrentUrl();
		 System.out.println("fill user name and password");
		 String USERNAME=Hs.getRow(1).getCell(1).getStringCellValue();
		 driver.findElement(By.name("uid")).clear();
		 driver.findElement(By.name("uid")).sendKeys(USERNAME);
         String PASSWORD=Hs.getRow(1).getCell(2).getStringCellValue();
		 driver.findElement(By.name("pwd")).clear();
		 driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
		
		 driver.findElement(By.name("Submit")).click();
     /*    //flag for session button
		 flag++;
		 if(flag==1)
		 {
			    driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[1]/form/table/tbody/tr[7]/td/input[1]")).click();
				System.out.println("your new session is start");
		   }
		  else
		    {
		    	driver.findElement(By.name("logout_existing_agent")).click();
		    	System.out.println("your old session is continue");
		    }
		 System.out.println("click on slider button");
 		 driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/div/img")).click();
 		String s1=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/table/tbody/tr/td[2]/div[2]/div[2]")).getText();
 		 Data();
 		//server();
 		assertion.assertEquals(s1, "Welcome adminrw");
 		assertion.assertAll();
 		*/
 	System.out.println("open browser method  is closed");
 }

}
