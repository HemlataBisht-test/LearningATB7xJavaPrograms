package July.ex_27072024;

public class Lab086 {
    public static void main(String[] args) {
        // Strings - imutable in nature
        // StringBuilder , StringBuffer
        String s1 = "Hema";
        s1 = "Bisht";

        StringBuffer stringBuffer = new StringBuffer("Hema");
        // change the value of string - Buffer
        stringBuffer.append("Bisht"); //PramodDutta
        stringBuffer.append("JI"); //PramodDutta

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");

        // Thead Safty?

        // stringBuilder - not thread safe - people LOVE it :)
    }
}
