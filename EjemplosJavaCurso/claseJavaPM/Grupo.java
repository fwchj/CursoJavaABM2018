package claseJavaPM;

import java.util.ArrayList;



public class Grupo {
	// Instance variables
	ArrayList<Estudiante> members = new ArrayList<Estudiante>();
	public String topic;
	public double grade;
	
	
	// Constructor
	public Grupo(String tema){
		this.topic = tema;
	}
	
	// Metodos
	public void describe(){
		// Imprimir el tema del grupo
		System.out.printf("Tema del grupo: %s\n",this.topic);
		// Imprimir la lista de los miembros
		for(Estudiante i:this.members){
			i.describe();
		}
		// Imprimir el número de miembros
		System.out.printf("Hay %s miembros en este grupo\n",this.members.size());
	}
}