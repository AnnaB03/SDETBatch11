package Class24;

public interface WebDriver {
    /*Create a WebDriver Interface that will have
    the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(),
    findElement(). Create 2 classes that implements
    WebDriver interface: ChromeDriver and FirefoxDriver.*/

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("ChromeDriver opens a browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("ChromeDriver closes a browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("ChromeDriver maximizes a window");
    }

    @Override
    public void findElement() {
        System.out.println("ChromeDriver finds an element");
    }
}
 class FireFoxDriver implements WebDriver {

     @Override
     public void openBrowser() {
         System.out.println("Firefox opens a browser");
     }

     @Override
     public void closeBrowser() {
         System.out.println("FireFox closes a browser");
     }

     @Override
     public void maximizeWindow() {
         System.out.println("FireFox maxs the window");
     }

     @Override
     public void findElement() {
         System.out.println("FireFox finds an element");
     }
 }