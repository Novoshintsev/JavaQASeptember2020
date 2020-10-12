import config.ServerConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Lesson02TestNG {

    private static WebDriver chromeDriver;
    private static final Logger LOGGER = LogManager.getLogger(Lesson02TestNG.class);
    private static final ServerConfig CFG = ConfigFactory.create(ServerConfig.class);

    @BeforeClass
    public void setTestEnvironment() {
        LOGGER.debug("Подключаем Chrome-драйвер");
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        LOGGER.debug("Подключен Chrome-драйвер");
    }

    @Test
    public void openPage1() {
        LOGGER.debug("Открываем URI в Chrome-браузере");
        chromeDriver.get(CFG.url());
        LOGGER.debug("Открыли URI в Chrome-браузере");

        LOGGER.debug("Получаем <title> страницы");
        LOGGER.debug("Получили <title>: " + chromeDriver.getTitle());
    }

    @AfterClass
    public  void clearTestEnvironment() {
        LOGGER.debug("Отключаем Chrome-драйвер");
        if (chromeDriver != null)
            chromeDriver.quit();
        LOGGER.debug("Chrome-драйвер отключен");
    }
}
