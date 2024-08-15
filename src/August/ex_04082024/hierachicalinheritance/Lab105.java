package August.ex_04082024.hierachicalinheritance;

public class Lab105 {
    public static void main(String[] args) {
    ElderSon es=new ElderSon();
    es.eSon();
  //  es.home();

    MiddleSon ms=new MiddleSon();
    ms.home();
    ms.mSon();

    youngerSon ys = new youngerSon();
    ys.ySon();
  //  ys.home();

    }
}
