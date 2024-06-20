package Day6;

public class SwitchStatmentsInJava {
    public static void main(String[] args) {

        String role = "admin";

        if (role.equals("admin"))
            System.out.println("You're an admin");
        else if (role == "moderator")
            System.out.println("You're a moderator");
        else
            System.out.println("You're a guest");


        int roles = 2;

        switch (roles){

            case 1:
                System.out.println("You're an Admin User");
                break;

            case 2:
                System.out.println("You're a Moderator User");
                break;

            default:
                System.out.println("You're a guest");
        }


    }
}
