package July.ex_14072024;

public class Lab021 {
    public static void main(String[] args) {
        String password ="Good@123";
        String password_u =password.toLowerCase();
        System.out.println(password_u);
        // password == password_u   ans is no
        System.out.println(password == password_u );   // false
        System.out.println(password.equals(password_u) );  //false
        System.out.println(password.equalsIgnoreCase(password_u) );  // true
        System.out.println(password.length());
        System.out.println(password.substring(0,4));
        System.out.println(password.indexOf('d'));

    }
}
