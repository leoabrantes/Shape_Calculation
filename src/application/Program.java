package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Triangle;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		List<AbstractShape> list= new ArrayList<>();

		System.out.println("How many shapes forms would you like to register? ");

		System.out.print("Type a number: ");
		int n = sc.nextInt();

		System.out.println();
		
		for (int i = 0; i < n; i++) {

			System.out.println();
			System.out.println("Shape number " + (i+1) + ":");
			System.out.print("Type 'c' for circle, 'r' for rectangle or 't' for triangle: ");
			char type = sc.next().charAt(0);

				while (type != 'c' && type != 'r' && type != 't') {
					System.out.println("Error: Type a different letter: ");
					System.out.print("Type 'c' for circle, 'r' for rectangle or t for triangle: ");
					type = sc.next().charAt(0);
				}
			
			System.out.println();
			sc.nextLine();

			System.out.println("Choose a right color: BLACK, YELLOW or WHITE ");
			System.out.print("Color: ");
			String colorName = sc.nextLine();
			
			System.out.println();

				while (colorName != "BLACK" && colorName != "YELLOW" && colorName != "WHITE") {
					
					System.out.println(colorName);
					System.out.println("Choose a right color: BLACK, YELLOW or WHITE ");
					System.out.print("Color: ");
					colorName = sc.nextLine();
				}
			
			Color color = Color.valueOf(colorName);
			
			System.out.println();
			
			if (type == 'c') {
				System.out.print("Type a radius number to calc the area: ");
				double r = sc.nextDouble();
				list.add(new Circle(color, r));
				
				
			} if (type == 'r') {

				System.out.print("Type a width number to calc the area: ");
				double w = sc.nextDouble();
				System.out.print("Type a height number to calc the area: ");
				double h = sc.nextDouble();
				list.add(new Rectangle(color, w, h));
				

			} else {

				System.out.print("Type a base number to calc triangle area: ");
				double b = sc.nextDouble();
				System.out.print("Type a height number to calc triangle area: ");
				double h = sc.nextDouble();
				list.add(new Triangle(color, b, h));
				
			}

		}
		
		System.out.println();
		System.out.println("INFORMATION: ");
		
		for(int i = 0; i < n; i++)
			System.out.println(list.get(i));
		sc.close();

	}

}
