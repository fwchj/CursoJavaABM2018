package claseJava;

public class Student {
	// Variables de instancia
	private String name;
	private String program;
	
	// Constructor
	public Student(String nombre, String programa){
		this.name = nombre;
		this.program = programa;
	}
	
	// Metodos
	public void describe(){
		System.out.printf("Hola, soy %s del programa %s\n",this.name,this.program);
	}
	
	// Método para regresar el nombre de la persona
	public String getName(){
		return this.name;
	}
	// Método para regresar el programa de la persona
	public String getProgram(){
		return this.program;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
