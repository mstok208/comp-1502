package mru.lab4.project;

import java.util.Scanner;

/**
 * This program demonstrates methods
 */

public class Geometry {
	
	public void runApplication() {
		int choice; // The user's choice
		double value = 0; // The method's return value
		char letter; // The user's Y or N decision
		double radius; // The radius of the circle
		double length; // The length of the rectangle
		double width; // The width of the rectangle
		double height; // The height of the triangle
		double base; // The base of the triangle
		double side1; // The first side of the triangle
		double side2; // The second side of the triangle
		double side3; // The third side of the triangle

		// Create a scanner object to read from the keyboard
		Scanner keyboard = new Scanner(System.in);

		// The do loop allows the menu to be displayed first
		do {
			printMenu();

			choice = keyboard.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter the radius of " + "the circle: ");
				radius = keyboard.nextDouble();
				
				circleArea(radius) ;
				value = circleArea(radius);

				System.out.println("The area of the " + "circle is " + value);
				break;
			case 2:
				System.out.print("Enter the length of " + "the rectangle: ");
				length = keyboard.nextDouble();
				System.out.print("Enter the width of " + "the rectangle: ");
				width = keyboard.nextDouble();
				
				rectangleArea(length, width);
				value = rectangleArea(length, width);

				System.out.println("The area of the " + "rectangle is " + value);
				break;
			case 3:
				System.out.print("Enter the height of " + "the triangle: ");
				height = keyboard.nextDouble();
				System.out.print("Enter the base of " + "the triangle: ");
				base = keyboard.nextDouble();

				triangleArea (base, height);
				value = triangleArea (base, height);

				System.out.println("The area of the " + "triangle is " + value);
				break;
			case 4:
				System.out.print("Enter the radius of " + "the circle: ");
				radius = keyboard.nextDouble();

				circleCircumference (radius);
				value = circleCircumference (radius);

				System.out.println("The circumference " + "of the circle is " + value);
				break;
			case 5:
				System.out.print("Enter the length of " + "the rectangle: ");
				length = keyboard.nextDouble();
				System.out.print("Enter the width of " + "the rectangle: ");
				width = keyboard.nextDouble();

				rectanglePerimeter (length, width);
				value = rectanglePerimeter (length, width);

				System.out.println("The perimeter of " + "the rectangle is " + value);
				break;
			case 6:
				System.out.print("Enter the length of " + "side 1 of the " + "triangle: ");
				side1 = keyboard.nextDouble();
				System.out.print("Enter the length of " + "side 2 of the " + "triangle: ");
				side2 = keyboard.nextDouble();
				System.out.print("Enter the length of " + "side 3 of the " + "triangle: ");
				side3 = keyboard.nextDouble();

				trianglePerimeter (side1, side2, side3);
				value = trianglePerimeter (side1, side2, side3);

				System.out.println("The perimeter of " + "the triangle is " + value);
				break;
			default:
				System.out.println("You did not enter " + "a valid choice.");
			}
			keyboard.nextLine(); // Consume the new line

			System.out.println("Do you want to exit " + "the program (Y/N)?: ");
			String answer = keyboard.nextLine();
			letter = answer.charAt(0);

		} while (letter != 'Y' && letter != 'y');
	}

	public void printMenu() {
		System.out.println("This is a geometry calculator");
		System.out.println("Choose what you would like to calculate");
		
		System.out.println("1. Find the area of a circle");
		System.out.println("2. Find the area of a rectangle");
		System.out.println("3. Find the area of a triangle");
		System.out.println("4. Find the circumference of a circle");
		System.out.println("5. Find the perimeter of a rectangle");
		System.out.println("6. Find the perimeter of a triangle");
		System.out.print("Enter the number of your choice: ");
	}
/**
 * Multiplies PI by the given user radius input to the power of 2  
 * requires radius
 * 
 * @param radius
 * @return the area of the circle with the radius given
 */
	public double circleArea(double radius) {
		return Math.PI * Math.pow(radius,2);
		
	}
	
/**
 * Takes the given length and width and multiplies them to give the value of the area of the rectangle
 * Requires length and width 
 * 
 * @param length
 * @param width
 * @return area of a rectangle with given values 
 */
	public double rectangleArea (double length, double width) {
		return length * width;
	}
	
/**
 * Multiplies base with height and divides it by 2 to get the area of a triangle with given values
 * requires base and height 
 * 
 * @param base
 * @param height
 * @return area of triangle 
 */
	public double triangleArea (double base, double height) {
		return (base * height)/2;
	}

/**
 * 2 multiplied by PI multiplied by radius input 
 * Requires radius 
 * 
 * @param radius
 * @return circle circumference
 */
	public double circleCircumference (double radius) {
		return 2 * Math.PI * radius;
	}
	
/**
 * multiplies length by 2 and adds that calculation to width multiplied by 2 
 * Requires length and width 
 * 
 * @param length
 * @param width
 * @return rectangle's perimeter
 */
	public double rectanglePerimeter (double length, double width) {
		return (length * 2) + (width *2);
	}
	
/**
 * Adds side1, side2, and side3 together
 * requires side1, side2, side3
 * 
 * @param side1
 * @param side2
 * @param side3
 * @return perimeter of a triangle 
 */
	public double trianglePerimeter (double side1, double side2, double side3) {
		return side1 + side2 + side3;
	}
}
	