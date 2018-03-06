import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaAsistencia {

	public static void main(String[] args) {
		
		ArrayList<String> inscripciones = new ArrayList<String>();
		
		Scanner input = new Scanner(System.in);
		
		boolean continuar = true;
		
		while(continuar){
			System.out.println("Favor de inscribirse con nombre y apellido: (Poner STOP para salir)");
			String nombre = input.nextLine();
			
			if(nombre.equals("STOP")){
				continuar = false;
			}
			else{
				inscripciones.add(nombre.trim());
			}
			
			
		} // end while
		
		Collections.sort(inscripciones);
		// Imprimir la lista completa
		System.out.println("LISTA DE PARTICIPANTES");
		System.out.println("----------------------");
		
		for(String name:inscripciones){
			System.out.printf("%s\n",name);
		}
		System.out.println("----------------------");
		System.out.printf("Hay %s participantes\n", inscripciones.size());
		
		
		input.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}









