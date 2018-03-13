package claseJava;

import java.util.ArrayList;

public class Group {
	// Instance variables
	public ArrayList<Student> members = new ArrayList<Student>();
	public String topic;
	public double grade;
	
	
	// Constructor
	public Group(String tema){
		this.topic = tema;
	}
	
	// Metodos
	public void describe(){
		// Imprimir el tema del grupo
		System.out.printf("Tema del grupo: %s\n",this.topic);
		// Imprimir la lista de los miembros
		for(Student i:this.members){
			System.out.printf("\t%s del programa %s\n",i.getName(),i.getProgram());
		}
		// Imprimir el número de miembros
		System.out.printf("Hay %s miembros en este grupo\n",this.members.size());
	}
	
	
	
	
	
	
	
	
	
	
}
