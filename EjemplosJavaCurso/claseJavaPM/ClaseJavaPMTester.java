package claseJavaPM;

public class ClaseJavaPMTester {

	public static void main(String[] args) {
		
		// generamos un grupo
		Grupo miGrupo = new Grupo("Grupo 1");
		
		// Agregamos alumnos de tipo subclase de Estudiante
		miGrupo.members.add(new EstudianteDomestico("Alejandro","ME", 1234, 9.6));
		miGrupo.members.add(new EstudianteIntercambio("Jesús" , "ME", 374848, "Colmex"));
		
		// Ejecutamos el método describe del grupo que a su vez ejecuta el describe de Estudiante
		miGrupo.describe();
	}

}
