// Define a method called greatest that takes three numbers and 
// returns the greatest of them. If there are multiple greatest values, 
// returning one of them is enough. Printing will take place in the main program.


public class Greatest {
    //Create a method that check the greatest number
    public static int greatest(int number1, int number2, int number3) {
        if(number1 > number2 && number1 > number3) {
            return number1;
        } else if (number2 > number1 && number2 > number3) {
            return number2;
        }
        return number3;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}