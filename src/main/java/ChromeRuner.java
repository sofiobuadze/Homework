import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ChromeRuner {
    @BeforeTest
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://roomshotels.com/tbilisi/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://roomshotels.com/tbilisi/");
    }
    @AfterTest
    public static void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.close();
    }

}
