// 1- Printing stars
// 2- Printing a square
// 3- Printing a rectangle
// 4- Printing a triangle

public class StarSign {

    public static void main(String[] args) {

        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }
    
    //%ethod for printing stars
    public static void printStars(int number) {
        // first part of the exercise
        int i = 1;
        while (i <= number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }
    
    //method for square
    public static void printSquare(int size) {
        // second part of the exercise
        int i = 1;
        while (i <= size) {
            printStars(size);
            i++;
        }
    }
    
    //method for rectangle
    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int i = 1;
        while (i <= width) {
            while (i <= height) {
                printStars(width);
                i++;
            }
            i++;
        }
    }
    
    //method for triangle
    public static void printTriangle(int size) {
        // fourth part of the exercise
        int i = 1;
        while(i <= size) {
            printStars(i);
            i++;
        }
    }
}
