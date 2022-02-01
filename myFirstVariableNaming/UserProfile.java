package myFirstVariableNaming;

import java.util.Scanner;

public class UserProfile {

	public static void main(String[] args) {
		
		//Declaracion de variables
		String name;
		int age;
		String gender;
		String jobPreference;
		String nationality;
		String bloodType;
		
		Scanner s = new Scanner(System.in); //Escanea valores de entrada
		
		System.out.print("Ingresa tu nombre: ");
		name = s.nextLine();
			
		System.out.print("Ingresa tu genero: ");
		gender = s.nextLine();
		
		System.out.print("Ingresa tu preferencia laboral: ");
		jobPreference = s.nextLine();
		
		System.out.print("Ingresa tu nacionalidad: ");
		nationality = s.nextLine();
		
		System.out.print("Ingresa tu tipo de sangre: ");
		bloodType = s.nextLine();
		
		System.out.print("Ingresa tu edad: ");
		age = s.nextInt();
		
		int yearBirth = 2022 - age;
		
		System.out.println(
					"\nNombre: " + name +
					"\nEdad: " + age +
					"\nGenero: " + gender +
					"\nPreferencia Laboral: " + jobPreference +
					"\nNacionalidad: " + nationality +
					"\nTipo de sangre: " + bloodType +
					"\nAño de nacimiento: " + yearBirth
				);

	}

}
