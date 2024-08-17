package August.ex_11082024.RealLife_ex;

public class Lab117 {
    public static void main(String[] args) {
        Chrome c=new Chrome();
        c.openBrowser("Chrome");
        c.closeBrowser("Chrome");

        FireFox f= new FireFox();
        f.openBrowser("FireFox");
        f.closeBrowser("FireFox");
        f.takeScreenshot();

    }
}
