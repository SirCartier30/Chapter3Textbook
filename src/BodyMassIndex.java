/**
 * @class:BodyMAssIndex
 * @author: Daniel Omotere
 * @course: ITEC 2140-04, Spring 2023
 * @written: February 6 , 2023
 * @description: This program will calculate the BMI of the user and will let them know if they are under weight,
normal weight, over weight, obese.
 */
import java.util.Scanner;
public class BodyMassIndex {
    public static void main (String [] args ) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.println("Enter your height in inches: ");
        double heightInInches = input.nextDouble();
        //This will prompt the user to enter the weight and inches.

        double weightInKg = weightInPounds * 0.4536;
        //This will convert pounds into kilogram
        double inchesToMeters = heightInInches * 0.0254;
        //This will convert inches to meters
        double BMI = weightInKg / (inchesToMeters * inchesToMeters);
        //This will convert BMi of the user

        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5 && BMI <= 25){

            System.out.println("Normal Weight");
        } else if (BMI >= 25 && BMI <= 29.9)
        {
            System.out.println("Over Weight");
        } else {
            System.out.println("Obesity");
        }
        //These will print out if the user is underweight, normal weight, over weight, and obesity.

            System.out.println("Your Body Mass Index (BMI) is " + BMI);
        //This will print out the BMI of the user
        }
    }

