package Generic_Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.apache.commons.math3.stat.regression.RegressionResults;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseTest {
	public WebDriver driver;
	public static WebDriver sdriver;
	
	public PropertyFileUtility pfutil=new PropertyFileUtility();
	
	
//	@Test
//	public void prac()
//	{
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver =new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//	}
	
//	@BeforeClass
//	public void prac() throws Throwable
//	{
//		String brow=pfutil.getDataFromProperties("Browser");
//		String urr=pfutil.getDataFromProperties("url");
//		
//		if (brow.equals("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();	
//		}
//		else if(brow.equals("firefox")) {
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();
//		}
//		else if(brow.equals("Microsoft edge")) {
//			WebDriverManager.edgedriver().setup();
//			driver=new EdgeDriver();
//		}
//		
//		sdriver=driver;
//		driver.get(urr);
//	}
//	@Test
//	public void sun()
//	{
//		System.out.println("lprint");
//	}

//	@Test
//	public void exc() throws EncryptedDocumentException, IOException
//	{
//		FileInputStream fis=new FileInputStream("./src/test/resources/Frame.xlsx");
//		Workbook wb=WorkbookFactory.create(fis);
//		 String data = wb.getSheet("details").getRow(1).getCell(2).getStringCellValue();
//		 System.out.println(data);
//		
//	}
	@Test
	public void m4() throws Throwable 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.keybr.com/");
		driver.manage().window().maximize();
	
	LocalDateTime currentDateTime=LocalDateTime.now();
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	String sc=currentDateTime.format(formatter);
	System.out.println(sc);
	String scr=sc.replaceAll(":","-");
		
		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/"+scr+".png");
		FileUtils.copyFile(src, dest);
		driver.close();
	}
//	public void m5()
//	{
//		LocalDateTime currentDateTime=LocalDateTime.now();
//		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//		String sc=currentDateTime.format(formatter);		
//		
//		System.out.println(sc);
//		
//		
//		
//	}

}
