package Generic_Library;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class JavaUtility 
{
	public int genRandomNumber (String[] args) 
	{
		Random rand=new Random();
		int randomnumber=rand.nextInt(1000);
//		System.out.println(randomnumber);
		return randomnumber;
	}
	
	public String getsysdatetime()
	{
		LocalDateTime currentDateTime=LocalDateTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String sc=currentDateTime.format(formatter);
		System.out.println(sc);
		String scr=sc.replaceAll(":","-");
		return scr;
		
	
	}

}
