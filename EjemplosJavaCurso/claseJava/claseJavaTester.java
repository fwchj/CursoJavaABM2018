package claseJava;

public class claseJavaTester {

	public static void main(String[] args) {
		
		// Aquí podemos usar el método declarado como 'static' sin haber iniciado un objeto de tipo Student 
		Student.sum(3, 4);
		
		Student alfredo 	= new Student("Alfredo Lefranc","LE");
		System.out.printf("Ahora hay %s alumnos\n",Student.numberOfStudents); // Aquí vemos que la variable estática cambió
		Student luis 		= new Student("Luis E. Colín","LE");
		System.out.printf("Ahora hay %s alumnos\n",Student.numberOfStudents);
		Student diego 		= new Student("Diego Gallo","LE");
		System.out.printf("Ahora hay %s alumnos\n",Student.numberOfStudents);
		Student jacqueline 	= new Student("Jacqueline Chacón","ME");
		System.out.printf("Ahora hay %s alumnos\n",Student.numberOfStudents);
		Student esther 		= new Student("Esther Santos","ME");
		System.out.printf("Ahora hay %s alumnos\n",Student.numberOfStudents);
		
		// Para generar un objeto de tipo StudentExchange, usamos su constructor
		StudentExchange jesus = new StudentExchange("Jesus Martín","ME","Colmex"); // => automáticamente llama al constructor de la clase superior!
		System.out.printf("Ahora hay %s alumnos\n",Student.numberOfStudents);

		alfredo.amigos.add(diego); //Agregamos un amigo a la list de amigos de alfredo
		diego.amigos.add(esther);
		
		
		Group grupo1 = new Group("Redes de contagio y producción");
		Group grupo2 = new Group("Modelo de competencia en aerolíneas");
		
		// Formar el grupo 1
		grupo1.members.add(alfredo);
		grupo1.members.add(luis);
		grupo1.members.add(diego);
		// Formar el grupo 2
		grupo2.members.add(jacqueline);
		grupo2.members.add(esther);
		grupo2.members.add(jesus);
		
		// Mostrar información sobre grupos
		
		grupo1.describe();
		grupo2.describe();
		
		alfredo.describe();	// aquí se ejecuta el códgio de Student.java
		jesus.describe();	// aquí se ejecuta el código de StudentExchange, ya que jesus es un alumno de intercambio
		
		
		
		
		
		
		
		
	}

}
