package Prepinsta_Java;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int OriginalNum = scanner.nextInt();
        int num = OriginalNum;
        int reversed = 0;
        while (num != 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }

        System.out.println("The reversed number is: " + reversed);

        if (OriginalNum == reversed) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is not a Palindrome.");
        }
    }
}
