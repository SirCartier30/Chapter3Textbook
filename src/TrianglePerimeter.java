/**
 * @class: TrianglePerimeter
 * @author: Daniel Omotere
 * @course: ITEC 2140-04, Spring 2023
 * @written: January 6, 2023
 * @description: This program will print out the perimeter of the triangle when given the three edges
 */

import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the first edge: ");
        double edge1 = sc.nextDouble();
        System.out.print("Enter the length of the second edge: ");
        double edge2 = sc.nextDouble();
        System.out.print("Enter the length of the third edge: ");
        double edge3 = sc.nextDouble();
        // This will prompt the user to enter the length of the three edges of a triangle


        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1) {

            double perimeter = edge1 + edge2 + edge3;
            // Calculate the perimeter

            System.out.println("Perimeter: " + perimeter);
            // This will print out the perimeter
        } else {
            System.out.println("Invalid input");
            //This will print out invalid input if two of the edges is less than the other edge
        }
    }
}



