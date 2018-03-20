package claseJavaPM;

public class EstudianteDomestico extends Estudiante {
	double promedioAcumulado;
	
	
	public EstudianteDomestico(String n, String p, int i,double promedio) {
		super(n, p, i); // Usamos el constructor de la superclase
		this.promedioAcumulado = promedio; // Aqu� nada m�s agregamos el valor que es �nico para el estudiante domestico
	}

	
	
	@Override
	public void describe() { // Se implementa el m�todo abstracto de Estudiante.java aqu�
		System.out.printf("Hola me llamo %s, soy alumno/a del CIDE y mi promedio acumulado es %4.2f\n",this.nombre,this.promedioAcumulado);
		
	}

	

}
