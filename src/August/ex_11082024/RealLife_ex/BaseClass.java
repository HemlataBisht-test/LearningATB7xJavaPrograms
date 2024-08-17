package August.ex_11082024.RealLife_ex;

abstract class BaseClass extends GrandBaseClass{

    abstract String openBrowser(String browser);
    abstract String closeBrowser(String browser);


    @Override
    void takeScreenshot() {
        System.out.println("Screenshot is taken");
    }
}

