package claseJavaPM;

public class EstudianteDomestico extends Estudiante {
	double promedioAcumulado;
	
	
	public EstudianteDomestico(String n, String p, int i,double promedio) {
		super(n, p, i); // Usamos el constructor de la superclase
		this.promedioAcumulado = promedio; // Aquí nada más agregamos el valor que es único para el estudiante domestico
	}

	
	
	@Override
	public void describe() { // Se implementa el método abstracto de Estudiante.java aquí
		System.out.printf("Hola me llamo %s, soy alumno/a del CIDE y mi promedio acumulado es %4.2f\n",this.nombre,this.promedioAcumulado);
		
	}

	

}
