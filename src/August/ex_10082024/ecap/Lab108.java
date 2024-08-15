package August.ex_10082024.ecap;

//Fixed Encapsulation
public class Lab108 {
    public static void main(String[] args) {
          VWOLogin1 vwologin = new VWOLogin1("admin","password123");
        System.out.println(vwologin.getUsername());
        vwologin.setUsername("newadmin");
        System.out.println(vwologin.getUsername());

        // Write a code to Auth
        // admin - isAuth = true
        vwologin.setPassword("123",true);

        }
    }

    class VWOLogin1{

    // Data members
        private String username;
        private String password;
    // By using the Getter and setter method we can access the private data members
        // and we can control the setting parts
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password, boolean isAuth) {
            if (isAuth){
                System.out.println("you can change the password");
                this.password = password;
            } else {
                System.out.println("Not allowed!");

            }

        }

        public VWOLogin1(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }



