
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 1;
        while (i <= number) {
            System.out.print("*");
            i++;
        }
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 1;
        while (i <= number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        // part 2 of the exercise
        while (i <= size) {
            printSpaces(size - i);
            printStars(i);
            System.out.println("");
            i++;
        }
    }

    public static void christmasTree(int height) {
        int i = 1;
        printSpaces(height);
        printStars(i);
        System.out.println("");

        //top tree
        while (i < height) {
            printSpaces(height - i);
            printStars(i);
            printStars(i + 1);
            System.out.println("");
            i++;
        }
        //tree base
        while (i <= height) {
            printSpaces(height - 1);
            printStars(3);
            System.out.println("");
            printSpaces(height - 1);
            printStars(3);
            System.out.println("");

            i++;
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}