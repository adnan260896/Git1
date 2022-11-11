import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAuthentications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/");
			//https://username:password@websiteurl
			//it directly enters the username and password when there is any window Authenticator
			driver.get("https://admin:admin@the-internet.herokuapp.com/");

	}

}
