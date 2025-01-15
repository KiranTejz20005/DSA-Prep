package Prepinsta_Java;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int remainder=0;
        int reverse=0;
        int number=scanner.nextInt();
        
        while (number!=0) {  //number=1234
            
        
        remainder = number%10; //4
        number = number / 10; //123
        reverse = (reverse*10)+remainder;

    }
    System.out.println("The reverse number:"+reverse);
    }
}
