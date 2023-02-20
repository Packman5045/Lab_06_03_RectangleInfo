import java.util.Scanner;
//this allows us to use input values from the user
public class Main {
    public static void main(String[] args)
    {
        String trash = "";
        int longSide = 0;
        int shortSide = 0;

    Scanner scan = new Scanner(System.in);

    System.out.println("What is the length of the longer side of the Rectangle?");

        if (scan.hasNextInt())
        {
            longSide = scan.nextInt();
            scan.nextLine();
        }
        else
        {
            System.out.println("ERROR, please use numbers " + trash + " is an invalid input.");
        }
            System.out.println("What is the length of the short side?");
        if (scan.hasNextInt())
        {
            shortSide = scan.nextInt();
            scan.nextLine();
        }
        else
        {
            System.out.println("ERROR, please use numbers " + trash + " is an invalid input.");
        }

        int area = longSide * shortSide;
        double pythag = (longSide * longSide) + (shortSide * shortSide);
        double diag = Math.sqrt(pythag);

            System.out.println("The area of the Rectangle is " + area);
            System.out.println("The length of the diagonal is " + pythag);









    }
}