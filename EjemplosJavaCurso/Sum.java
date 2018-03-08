
public class Sum {

	public static void main(String[] args) {
		// Definimos las variables que vamos a usar para los cálculos
		double numero1 = 5.6;
		double numero2 = 4.5;
		double[] arreglo = {4.5,3.4,5.6};
		
		// Aquí imprimimos la suma de dos double
		System.out.printf("numero1 + numero2 = %s\n ",sum(numero1, numero2));
		
		double c = 3.4444444; // Definimos una variable que no vamos a usar, pero para ilustrar el comportamiento de Java
		
		double sum = sum(arreglo); // Guardamos la suma del arregla usando el método
		
		System.out.printf("Suma del arreglo = %s\n ",sum); //Imprimimos esta suma
		System.out.printf("c=%s\n",c); //Imprimimos la variable c: vemos que no se ve afectada por la c que aparece en la línea 22!
		
	}
	private static double sum(double[] arreglo) {
		double c=0.0;
		for(double i:arreglo){
			c+=i;
		}
		return c;
	}
	private static double sum(double a, double b){
		double c = a+b;
		return c;
	}
}








