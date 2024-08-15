package August.ex_04082024.SingleInheritance;

public class TestCase2 extends BaseTest{

    void testcase2(){
        startBrowser();
        getDataFromSQL();
        System.out.println(gold);
        closeBrowser();
    }

    public static void main(String[] args) {
        new TestCase2().testcase2();
    }
}
