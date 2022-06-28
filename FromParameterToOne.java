
public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    //Create a new method
    public static void printFromNumberToOne(int number) {
        int i = 1;
        while (number >= i) {
            System.out.println(number);
            number--;
        }
    }
}
