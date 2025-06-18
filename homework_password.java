import java.util.Scanner;

public class homework_password {
    public static void main(String[] args) {
        System.out.println("enter password");
        Scanner input = new Scanner(System.in);
        String pass = input.next();


        boolean is_strong=hasuppercase(pass)&&
                hadigit(pass)&&
                haslowercase(pass)&&
                hasSpecialChar(pass)&&
                had8character(pass);


        if (is_strong){
            System.out.println("Password is strong.");
        }
        else {
            System.out.println("Password is weak. It must meet the following criteria:");
            if (had8character(pass)) {
                System.out.println("- At least 8 characters long");
            }
            if (hasuppercase(pass)) {
                System.out.println("- At least one uppercase letter");
            }
            if (haslowercase(pass)) {
                System.out.println("- At least one lowercase letter");
            }
            if  (hadigit(pass)) {
                System.out.println("- At least one digit");
            }
            if (hasSpecialChar(pass)) {
                System.out.println("- At least one special character (e.g., !@#$%^&* etc.)");
            }
        }

    }

    public static boolean hasuppercase(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isUpperCase(pass.charAt(i))) {
                return true;
            }
        }
        return false;

    }

    public static boolean haslowercase(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isLowerCase(pass.charAt(i))) {
                return true;
            }
        }
        return false;

    }

    public static boolean hadigit(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) {
                return true;
            }
        }
        return false;

    }

    public static boolean had8character(String pass) {
        int length = pass.length();

        if (length >= 8) {
            return true;
        }
        return false;
    }

    public static boolean hasSpecialChar(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isLetterOrDigit(pass.charAt(i))) {
                return true;
            }
        }
        return false;

    }
}
