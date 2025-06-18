import java.util.Scanner;

public class homeworkprime {
    public static void main(String[] args) {
        System.out.println("enter number");
        int primenumber;
        int number = 2;
        Scanner input = new Scanner(System.in);
        primenumber = input.nextInt();
        if (primenumber % number != 0 || primenumber % primenumber == 1) {
            System.out.println("this number is prime number");
        } else if (primenumber == 2) {
            System.out.println("this number is prime number");
        } else {
            System.out.println("this is not prime number");
        }

    }
}
