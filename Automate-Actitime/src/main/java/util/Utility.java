package util;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
        static String s;

        static DateTimeFormatter dateTime;	
	    public static WebDriver takeScreenShot(WebDriver driver) throws IOException {
		
		dateTime = DateTimeFormatter.ofPattern("dd_mm_yyyy_HH_mm_ss");		
		LocalDateTime now= LocalDateTime.now();
		s=dateTime.format(now);

		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest= new File("C:\\screeshot\\test123.jpg");
	    FileHandler.copy(source, dest);
	    return driver;
	}
}
