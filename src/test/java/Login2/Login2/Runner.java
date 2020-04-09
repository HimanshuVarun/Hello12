package Login2.Login2;

import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class Runner extends MethotClass
{
	public static ExtentReports extent;
	public static  ExtentTest   logger;
  @BeforeTest
    public  void before() throws Exception 
	{
	  System.out.println("Start Browser test case");

try {

	  System.out.println("call open Browser method ");
	  openBrowser();
	  System.out.println("close open browser method in try block");
  } 
 catch(Exception e)
	  {
	   System.out.println(e.getMessage()+" catch block");
	  } 
        System.out.println(" closed Browser test case");
	}
 

}
