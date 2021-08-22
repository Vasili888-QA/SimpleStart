package simpleStart.stepDefinitions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.Before;
import io.qameta.allure.selenide.AllureSelenide;

public class Hooks {
    @Before
    public void start(){
       // Configuration.startMaximized = true;
        Configuration.browserSize = "1380x850";
//        Configuration.timeout = 5000;
        Configuration.webdriverLogsEnabled = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        //SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(false).savePageSource(false));

//  Just to show some configuration examples
//        Configuration.headless = true;
//        Configuration.baseUrl = "www.example.com";
//        Configuration.browser = "firefox";
//        Configuration.downloadsFolder = "src/test/resources/download";

    }
}
