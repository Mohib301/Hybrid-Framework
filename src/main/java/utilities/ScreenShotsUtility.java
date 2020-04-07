package utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import core.BaseClass;

public class ScreenShotsUtility extends BaseClass {

	
public static void screenshot (WebDriver driver) throws IOException {
		
		// takes screen shot using TakeScreenshot method of selenium and store as file
		String screenshotsPath = System.getProperty("user.dir")+"\\screenShots\\";

		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(screenshotsPath+getcurrentdateandtime()+".png"));
	}
	

	public static String getcurrentdateandtime() {
		String str = null;
		try {
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
			Date date = new Date();
			str = dateFormat.format(date);
			str = str.replace(" ", "").replaceAll("/", "").replaceAll(":", "");
		} catch (Exception e) {
		}
		return str;
	}
}
