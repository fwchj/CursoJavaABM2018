package claseJava;

public class claseJavaTester {

	public static void main(String[] args) {
		Student alfredo 	= new Student("Alfredo Lefranc","LE");
		Student luis 		= new Student("Luis E. Col�n","LE");
		Student diego 		= new Student("Diego Gallo","LE");
		Student jacqueline 	= new Student("Jacqueline Chac�n","ME");
		Student ester 		= new Student("Esther Santos","ME");

		Group grupo1 = new Group("Redes de contagio y producci�n");
		Group grupo2 = new Group("Modelo de competencia en aerol�neas");
		
		// Formar el grupo 1
		grupo1.members.add(alfredo);
		grupo1.members.add(luis);
		grupo1.members.add(diego);
		// Formar el grupo 2
		grupo2.members.add(jacqueline);
		grupo2.members.add(ester);
		
		// Mostrar informaci�n sobre grupos
		
		grupo1.describe();
		grupo2.describe();
		
		
		
		
		
		
		
		
	}

}
