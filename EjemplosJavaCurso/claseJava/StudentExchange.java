package claseJava;

public class StudentExchange extends Student{

	String origin;
	public StudentExchange(String nombre, String programa,String origin) {
		super(nombre, programa);
		this.origin = origin;
		
	}
	
	// Metodos
		public void describe(){ //Volvemos a delcarar el método que ya está en Student, para poder agregarle un elemento más. 
			// TODO : hay que poner más información sobre el individuo
			System.out.printf("   Hola, soy %s del programa %s y vengo de %s\n",this.name,this.program,this.origin);
			
		}
	
	

}
