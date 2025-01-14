package Prepinsta_Java;
import java.util.*;
public class sumOfNatural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
            int SoN =(num*(num+1)/2);
            System.out.println(SoN);    
         
    }
}
