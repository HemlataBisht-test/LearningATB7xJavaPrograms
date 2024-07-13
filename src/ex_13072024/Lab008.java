package ex_13072024;

public class Lab008 {
    public static void main(String[] args) {
        // Escape Chars
        char c = '\n'; // New line / Next Line
        char c1 = '\t'; // Add Tab
        char c2 = '\b'; // Backlash, delete 1 char
        char c3 = '\r'; // Backlash, delete 1 word
       System.out.println("Hemlata" + c3 + "Bisht");   //ans is Bisht remove the first word
      System.out.println("Hemlata" + c2 + "Bisht");      // remove the last character of 1st word
        System.out.println("Hemlata" + c1 + "Bisht");      // Add 1 space
        System.out.println("Hemlata" + c + "Bisht");        // add new line
    }
}
