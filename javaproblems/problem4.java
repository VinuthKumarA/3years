package javaproblems;
import java.util.Scanner;
public class problem4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the x-coordinate of the point: ");
            double x = scanner.nextDouble();
            System.out.print("Enter the y-coordinate of the point: ");
            double y = scanner.nextDouble();

            if (x == 0 && y == 0) {
                System.out.println("The point lies at the origin (0, 0)");
            } else if (x == 0) {
                System.out.println("The point lies on the y-axis");
            } else if (y == 0) {
                System.out.println("The point lies on the x-axis");
            } else if (x > 0 && y > 0) {
                System.out.println("The point lies in the 1st Quadrant");
            } else if (x < 0 && y > 0) {
                System.out.println("The point lies in the 2nd Quadrant");
            } else if (x < 0 && y < 0) {
                System.out.println("The point lies in the 3rd Quadrant");
            } else {
                System.out.println("The point lies in the 4th Quadrant");
            }
        }
    }


