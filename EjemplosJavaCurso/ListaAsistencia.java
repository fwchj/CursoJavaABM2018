import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaAsistencia {

	public static void main(String[] args) {
		
		// Declaramos la lista donde ponemos los datos
		ArrayList<String> inscripciones = new ArrayList<String>();
		
		//Abrimos un scanner para leer lo que incida el usuario
		Scanner input = new Scanner(System.in);
		
		// Variable que indica si sigue el loop
		boolean continuar = true;
		
		while(continuar){ // Hacemos un loop hasta que se pone la palabra STOP
			System.out.println("Favor de inscribirse con nombre y apellido: (Poner STOP para salir)");
			String nombre = input.nextLine(); //Leemos toda la linea que escribió el usuario
			
			if(nombre.equals("STOP")){ // Si puso STOP, salimos del loop
				continuar = false; //poner eso en false hace que ya no sigue el while
			}
			else{
				inscripciones.add(nombre.trim()); // Agregamos el texto a la lista.
				// La función trim() quita los espacios blancos al inicio y final del nombre
			}
			
			
		} // end while
		
		// Ordenamos alfabeticamente la lista
		Collections.sort(inscripciones);
		
		
		// Imprimir la lista completa
		System.out.println("LISTA DE PARTICIPANTES");
		System.out.println("----------------------");
		
		// Hacemos un loop de todos los datos en la lista
		for(String name:inscripciones){
			System.out.printf("%s\n",name);
		}
		System.out.println("----------------------");
		System.out.printf("Hay %s participantes\n", inscripciones.size());
		
		
		//Cerramos el scanner (ya no se necesita)
		input.close();
		
	}

}









