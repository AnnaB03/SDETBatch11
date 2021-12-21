package Class24;

public class WebDriverTester {
    public static void main(String[] args) {

        WebDriver [] webDriver = {new ChromeDriver(),new FireFoxDriver()};
                for (WebDriver wD:webDriver) {
                    wD.closeBrowser();
                    wD.findElement();
                    wD.maximizeWindow();
                    wD.openBrowser();
                }
    }
}

