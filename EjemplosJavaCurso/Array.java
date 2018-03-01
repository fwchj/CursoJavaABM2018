
public class Array {

	public static void main(String[] args) {

		// Here we define a very simple array
		double[] array = {1.0,2.5,8.6};
		
		// Let us not print the values as long until the first value above 2
		for(double i:array){
			System.out.print(i+"\n");
			if(i>2.0){
				break;
			}
		}

	}

}
