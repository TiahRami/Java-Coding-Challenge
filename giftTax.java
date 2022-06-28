// Gift tax

// https://www.vero.fi/en/individuals/property/gifts/: A gift is a transfer of property to another person against no compensation or payment. If the total value of the gifts you receive from the same donor in the course of 3 years is €5,000 or more, you must pay gift tax.

// When a gift is given by a close relative or a family member, the amount of gift tax is determined by the following table (source vero.fi):

// Value of gift	    Tax at the lower limit	Tax rate(%) for exceeding part
// 5 000 — 25 000	     100	                8
// 25 000 — 55 000	     1 700	                10
// 55 000 — 200 000	     4 700	                12
// 200 000 — 1 000 000	 22 100	                15
// 1 000 000 — ...       142 100	            17
// For example 6000€ gift implies 180€ of gift tax (100 + (6000-5000) * 0.08), and 75000€ gift implies 7100€ of gift tax (4700 + (75000-55000) * 0.12).

// Write a program that calculates the gift tax for a gift from a close relative or a family member.

import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                
        //Ask the value of the gift
        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
                
        //Check the gift tax
        if (giftValue < 5000) {
            System.out.println("No tax!");
        } else if (giftValue < 25000){
            double taxRate = 0.08;
            int taxLimit = 100;
            System.out.println("Tax: " + (taxLimit + (giftValue - 5000)* taxRate));
        } else if (giftValue < 55000){
            double taxRate = 0.1;
            int taxLimit = 1700;
            System.out.println("Tax: " + (taxLimit + (giftValue - 25000)* taxRate));
        } else if (giftValue < 200000){
            double taxRate = 0.12;
            int taxLimit = 4700;
            System.out.println("Tax: " + (taxLimit + (giftValue - 55000)* taxRate));
        } else if (giftValue < 1000000){
            double taxRate = 0.15;
            int taxLimit = 22100;
            System.out.println("Tax: " + (taxLimit + (giftValue - 200000)* taxRate));
        } else {
            double taxRate = 0.17;
            int taxLimit = 142100;
            System.out.println("Tax: " + (taxLimit + (giftValue - 1000000)* taxRate));
        }
    }
}