import java.util.Scanner;

public class homework_palindrome {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String Text = input.nextLine();

            int first = 0;

            int second = Text.length() - 1;

            boolean isPalindrome = true;
            while (first < second) {
                if (Text.charAt(first) != Text.charAt(second)) {
                    isPalindrome = false;
                    break;
                }

                first++;
                second--;
            }

            if (isPalindrome)
                System.out.println(Text + " is a palindrome");
            else
                System.out.println(Text + " is not a palindrome");
        }
    }

