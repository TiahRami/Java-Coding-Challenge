// A year is a leap year if it is divisible by 4. However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.

// Write a program that reads a year from the user, and checks whether or not it is a leap year.

//your code goes here


import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Ask for a year
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());

        //Check if it is a leap year
        if (year % 4 != 0) {
            System.out.println("The year is not a leap year.");
        } else if (year % 4 == 0 && year % 100 == 0){
            if (year % 400 == 0) {
                System.out.println("The yaer is a leap year");
            } else {
                System.out.println("The year is not a leap year");
            }
        } else {
            System.out.println("The yaer is a leap year");
        }
    }
}
