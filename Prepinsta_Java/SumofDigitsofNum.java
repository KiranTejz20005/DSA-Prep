package Prepinsta_Java;
import java.util.*;
public class SumofDigitsofNum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scanner.nextInt();
        int sum=0;   
        while(num!=0){
             sum+=num%10;
             num=num/10;
        }
        System.out.println("Sum of the Digits:"+sum);
    }
}