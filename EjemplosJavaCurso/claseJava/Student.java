package claseJava;

import java.util.ArrayList;

public class Student {
	// Variables de instancia
	protected final String name; // FIXME: discutir con el equipo si el final está bien
	String program;
	private int ID;
	public ArrayList<Student> amigos = new ArrayList<Student>();
	
	// Variable static (o de clase)
	public static int numberOfStudents = 0;
	
	// Constructor
	public Student(String nombre, String programa){
		this.name = nombre;
		this.program = programa;
		this.ID = ++Student.numberOfStudents;
	}
	
	// Metodos
	public void describe(){
		// TODO : hay que poner más información sobre el individuo
		System.out.printf("    Hola, soy %s del programa %s\n",this.name,this.program);
		
	}
	
	// Método para regresar el nombre de la persona
	public String getName(){
		return this.name;
	}
	// Método para regresar el programa de la persona
	public String getProgram(){
		return this.program;
	}
	// Método para regresar el ID del individuo
	public int getID() {
		return this.ID;
	}
	
	public static void sum(int n1, int n2){
		System.out.printf("%s + %s = %s\n", n1,n2,n1+n2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
