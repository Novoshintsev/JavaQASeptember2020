import config.ServerConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Lesson02Test {

    protected static WebDriver chromeDriver;
    protected static WebDriver firefoxDriver;
    private static final Logger LOGGER = LogManager.getLogger(Lesson02Test.class);
    private static final ServerConfig CFG = ConfigFactory.create(ServerConfig.class);

    @BeforeClass
    public static void setTestEnvironment()  {

        LOGGER.debug("Подключаем Chrome-драйвер");
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        LOGGER.debug("Подключен Chrome-драйвер");

        LOGGER.debug("Подключаем Firefox-драйвер");
        WebDriverManager.firefoxdriver().setup();
        firefoxDriver = new FirefoxDriver();
        LOGGER.debug("Подключен Firefox-драйвер");
    }

    @Test
    public void openPage1() {
        LOGGER.debug("Открываем URI в Chrome-браузере");
        chromeDriver.get(CFG.url());
        LOGGER.debug("Открыли URI в Chrome-браузере");

        LOGGER.debug("Открываем URI в Firefox-браузере");
        firefoxDriver.get(CFG.url());
        LOGGER.debug("Открыли URI в Firefox-браузере");
    }


    @Test
    public void openPage2() {
        LOGGER.debug("Открываем URI в Chrome-браузере");
        chromeDriver.get(CFG.url2());
        LOGGER.debug("Открыли URI в Chrome-браузере");

        LOGGER.debug("Открываем URI в Firefox-браузере");
        firefoxDriver.get(CFG.url2());
        LOGGER.debug("Открыли URI в Firefox-браузере");
    }

    @AfterClass
    public static void clearTestEnvironment() {
        LOGGER.debug("Отключаем Chrome-драйвер");
        if (chromeDriver != null)
            chromeDriver.quit();
        LOGGER.debug("Chrome-драйвер отключен");
        LOGGER.debug("Отключаем Firefox-драйвер");
        if (firefoxDriver != null)
            firefoxDriver.quit();
        LOGGER.debug("Firefox-драйвер отключен");
    }

}
