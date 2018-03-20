package claseJavaPM;

import java.util.ArrayList;

public abstract class Estudiante {
	
	// variables de instancia
	String nombre;
	ArrayList<Estudiante> amigos = new ArrayList<Estudiante>();
	String programa;
	int ID;
	
	// Constructor
	public Estudiante(String n,String p,int i){
		this.nombre = n;
		this.programa = p;
		this.ID = i;
	}
	
	// Clases abstractas
	
	public abstract void describe();
	
	// Método para regresar el nombre de la persona
		public String getName(){
			return this.nombre;
		}
		// Método para regresar el programa de la persona
		public String getProgram(){
			return this.programa;
		}
		// Método para regresar el ID del individuo
		public int getID() {
			return this.ID;
		}

}
