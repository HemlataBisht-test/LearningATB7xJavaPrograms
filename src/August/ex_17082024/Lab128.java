package August.ex_17082024;

public class Lab128 {
    public static void main(String[] args) {
    APIAutomation api = new APIAutomation(); // here IIB called
        // SIB - call 1 time   because of file loader load the file
        // IIB - when object is created.
    }
}

class APIAutomation{
    static {
        // write a code to load the data from the MySQL
        System.out.println("Loaded data from the MYSQL");
    }
    {
        // write a code to load the data from the CSV file
        System.out.println("Loaded data from the CSV");
    }

}