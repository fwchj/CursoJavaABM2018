package test;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		Scanner ingreso = new Scanner(System.in);
		
		System.out.println("Ingresa un primer n�mero:");
		double n1 = ingreso.nextDouble();
		System.out.println("Ingresa otro n�mero:");
		double n2 = ingreso.nextDouble();
		
		double suma = n1 + n2;
		
		System.out.printf("La suma de los dos valores es: %s",suma);
		
		ingreso.close();

	}

}
