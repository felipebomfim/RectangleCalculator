package com.chatgpt.rectangleCalculator;
import java.util.Locale;
import java.util.Scanner;

public class RectangleCalculator {
	
	

	public static void main(String[] args) {
	  Locale.setDefault(Locale.ENGLISH);
		Scanner scanner = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		System.out.println("Welcome to the Rectangle Calculator!");
		System.out.print("Enter the rectangle length: ");
		rect.setLength(scanner.nextDouble());
		System.out.print("Enter the rectangle width: ");
    rect.setWidth(scanner.nextDouble());
    
    System.out.printf("Area: %.1f\n", rect.getArea());
    System.out.printf("Perimeter: %.1f\n", rect.getPerimeter());
    System.out.printf("Perimeter: %.1f\n", 10.0);

    
		
		scanner.close();
	}
}
