package circle;

import java.util.Scanner;

public class AreaPerimeter {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		int diameter;
		double area, perimeter, diameterDouble;
		
		System.out.print("Ingresa el diametro del circulo: ");
		diameter = enter.nextInt();
		
		diameterDouble = diameter;
	
		area = Math.PI * Math.pow((diameterDouble/2), 2);
		perimeter = 2 * Math.PI * (diameterDouble/2);
		
		System.out.println(
					"El area del circulo es: " + area +
					"\nEl perimetro del circulo es: " + perimeter
				);

	}

}
