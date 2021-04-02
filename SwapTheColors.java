import java.util.Arrays;
import java.util.Scanner;

public class SwapTheColors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] colors = readMatrix(scanner);
        EnterChangedColor(scanner,colors);

        printColors(colors);





    }
    public static String[][] readMatrix(Scanner scanner){
        System.out.println("With how much pages to be the album?");
        System.out.print("Add count of pages here -> : ");
        int countColors = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[countColors][];
        System.out.println();
        System.out.println("_______WELCOME IN OUR COLOR SHOP________");
        System.out.println("Add COLORS DOWN");
        System.out.println("     ||      ");
        System.out.println("     ||      ");
        System.out.println("    HERE     ");

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
        return matrix;
    }
    public static void printColors (String[][] colors){
        System.out.println("-------------------------------------------------------------");
        for (String[] color : colors) {
            for (String s : color) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println();
        System.out.println("HAVE A NICE DAY");
    }
    public static void EnterChangedColor (Scanner scanner,String[][] colors){
        System.out.println("***********************************");
        System.out.println("-----------ADD NEEDED COLOR________________");
        System.out.println("HERE :");
        String color = scanner.nextLine();
        System.out.println("YOUR COLOR IS: "+color);
        System.out.println("***********************************");

        String[][] swapWantedColor  = swapMatrix(colors,color);


    }

    private static String[][] swapMatrix(String[][] colors,String color) {

        for (int row = 0; row < colors.length; row++) {
            String elementForSwap = colors[row][colors[row].length - 1];
            colors[row][colors[row].length - 1] = color;
        }



        System.out.println("-------------------------------------");
        System.out.println("We change your last added color with your want color");
        System.out.println("_____________________________________");
        System.out.println("Your album:");



return colors;
    }

}
