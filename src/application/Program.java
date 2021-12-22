package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.AbstractShape;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("How many shapes would you like to register? ");
		System.out.println();

		System.out.print("Type a number: ");
		int n = sc.nextInt();
		List<AbstractShape> list= new ArrayList<>();

		for (int i = 0; i < n; i++) {

			System.out.println();
			System.out.println("Shape number " + (i+1) + ":");
			System.out.print("Type 'c' for circle or 'r' for rectangle: ");
			char type = sc.next().charAt(0);

				while (type != 'c' && type != 'r') {
					System.out.println("Error: Type a different letter: ");
					System.out.print("Type 'c' for circle or 'r' for rectangle: ");
					type = sc.next().charAt(0);
				}
			
			System.out.println();

			if (type == 'c') {
				System.out.print("Type a radius number: ");
				double r = sc.nextDouble();
				list.add(new Circle(Color.BLACK, r));
				
			} else {

				System.out.print("Type a width number: ");
				double w = sc.nextDouble();
				System.out.print("Type a height number: ");
				double h = sc.nextDouble();
				list.add(new Rectangle(Color.BLACK, w, h));

			}
			

		}
		
		System.out.println();

		System.out.println("INFORMATION: ");
		
		
		for(int i = 0; i < n; i++)
			
			System.out.println(list.get(i));

		sc.close();

	}

}
