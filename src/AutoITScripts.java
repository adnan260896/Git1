import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoITScripts {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String DownloadPath =System.getProperty("user.dir");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", DownloadPath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("Prefs", chromePrefs);
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.ilovepdf.com/pdf_to_jpg");
			driver.findElement(By.id("pickfiles")).click();
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\SeleniumExcel\\FileUpload.exe");
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("processTask")));
			driver.findElement(By.id("processTask")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pickfiles")));
			driver.findElement(By.id("pickfiles")).click();
			Thread.sleep(5000);
			File f = new File(DownloadPath + "/ilovepdf_pages-to-jpg.zip");
			if(f.exists())
			{
				System.out.println("FileFound");
			}

	}

}
