package Prepinsta_Java;
import java.util.*;
public class SumofNumbtwIntervals {
    public static void main(String[]args){
    int num1,num2;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the values of a:");
    num1 = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter the values of b:");
    num2=scanner.nextInt();

    int SumofNums = (num2*(num2+1)/2)-(num1*(num1+1)/2)+num1;

    System.out.println("The sum of Numbers between the given intervals is "+sumOfNatural);
    


  }
}
