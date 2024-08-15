package August.ex_04082024;

public class Lab098 {
    public static void main(String[] args) {
        ATBPerson p0 = new ATBPerson();
        ATBPerson p1 = new ATBPerson("Hemlata");
        ATBPerson p2 = new ATBPerson("Amit", 988665566);
        System.out.println(p0.name);
        System.out.println(p1.name);
        System.out.println(p1.phone);
        System.out.println(p2.name);
        System.out.println(p2.phone);

    }
}
