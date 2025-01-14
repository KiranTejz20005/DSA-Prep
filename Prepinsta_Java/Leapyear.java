package Prepinsta_Java;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if( year%400==0|| (year%4==0 && year%100!=0)){
            System.out.println(year+ " is a Leap year");
        }
        else{
            System.out.println(year+" is not a Leap year");
        }
    }
}
