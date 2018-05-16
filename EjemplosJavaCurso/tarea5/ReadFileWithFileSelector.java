package tarea5; 

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class ReadFileWithFileSelector {

	public static void main(String[] args) {
		
		//CAMBIO: Creamos una instancia del selector de archivos
		final JFileChooser fc = new JFileChooser("C:/git");
		fc.showOpenDialog(null); // Lo hacemos visible
		
		
		
		// Start defining the necessary objects for the input
		Scanner scanner = null;			// Declare the scanner
		
		try { // We need the try-catch in case of not finding the file
			// Here we define the scanner, instead of System.in (console)
			// we now use the FileReader
			scanner = new  Scanner(new FileInputStream(fc.getSelectedFile()), "UTF-8"); //CAMBIO Aqui usamos el archivo del selector y definimos el formato UTF-8
		} catch (FileNotFoundException e) {
			System.out.println("I could not find the file"); //error msg sent if file not found
			e.printStackTrace(); 
			
		}
		scanner.useDelimiter(",|\\n");  //CAMBIO:  Define the symbol ,  AND the line break as separator between two elements
		scanner.nextLine();			// Jump to the next line (in case the first line has only titles
		
		while(scanner.hasNext()){ // Check if there is a next element (continue until the end of file (EOF))
			String name 		= scanner.next().trim(); // load first element as String and save as name
			String familyName 	= scanner.next().trim(); // load second element as String 
			int age 			= scanner.nextInt();	 // load the age to a integer
			boolean female 		= scanner.nextBoolean();	// load the female variable to a boolean
			double grossIncome  = Double.parseDouble(scanner.next()); // convert the string to a double
			
			// Simply print to the console what we have read
			if(female){
				System.out.printf("Mrs %s %s is %s years old and earns %9.2f dolars (gross)\n",name,familyName,age,grossIncome);
			}
			else{
				System.out.printf("Mr %s %s is %s years old and earns %9.2f dolars (gross)\n",name,familyName,age,grossIncome);
			}
		}
		

	}

}
