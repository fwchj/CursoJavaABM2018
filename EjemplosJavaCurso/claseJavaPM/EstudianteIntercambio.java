package claseJavaPM;

public class EstudianteIntercambio extends Estudiante {
	String origen;
	
	public EstudianteIntercambio(String n, String p, int i, String o) {
		super(n, p, i);
		this.origen = o;
	}

	
	
	@Override
	public void describe() { // Se implementa el m�todo abstracto de Estudiante.java aqu�
		System.out.printf("Hola me llamo %s, vendo de %s\n",this.nombre,this.origen);

	}

}
