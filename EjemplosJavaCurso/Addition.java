import java.util.InputMismatchException;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		Scanner ingreso = new Scanner(System.in);
		double n1=9,n2=9;
		
		boolean datosOK = false;
		while(datosOK==false) {
			try {
				System.out.println("Ingresa un primer número:");
				n1 = ingreso.nextDouble();
				System.out.println("Ingresa otro número:");
				n2 = ingreso.nextDouble();
				datosOK=true;
			}catch(InputMismatchException error) {
				System.out.println("Hay un error. Tienes que poner únicamente números");
				ingreso.next();
				System.out.printf("ERROR MESSAGE"+error+"\n");
			}
		}
		
		
		double suma = n1 + n2;
		
		System.out.printf("La suma de los dos valores es: %s",suma);
		
		ingreso.close();

	}

}
