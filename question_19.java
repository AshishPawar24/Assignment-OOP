import java.util.Scanner;
public class question_19{
    public static boolean isPalindrome(int number) {
        int originalNumber = number; 
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            number = number / 10; 
        }
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
