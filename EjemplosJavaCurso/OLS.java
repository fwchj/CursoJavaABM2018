
public class OLS {

	public static void main(String[] args) {
		
		// Define the two mathematical vectors as arrays (we could also use ArrayList, but it's more efficent to use the array here
		double[] x = {9.55,9.36,0.2,2.06,5.89,9.3,4.74,2.43,6.5,4.77};
		double[] y = {15.28,16.16,1.2,5.14,9.82,13.88,6.3,3.71,9.96,9};
	
		
		
		int N = x.length; 		// Obtain the number of observations
		double xSum=0, ySum=0;	// Define two variables where we will put the sum of each vector
		
		for(int i=0;i<N;i++){	// Loop through the arrays and sum all up
			xSum+=x[i];	
			ySum+=y[i];
		}
		
		double xMean = xSum/N;	// Obtain mean by dividing the sums by the number of elements
		double yMean = ySum/N;
		
		double SSxy=0, SSxx=0;	// Define two variables to the sum of squares
		for(int i=0;i<N;i++){
			SSxy += (y[i]-yMean)*(x[i]-xMean);	// Compute the sum of squares by looping through the array
			SSxx += Math.pow(x[i]-xMean,2);
		}
		
		double beta = SSxy/SSxx;				// Compute the parameter beta according to the formula
		double alpha = yMean - beta*xMean;		// Compute the parameter alpha according to the formula	
		
		System.out.printf("alpha: %9.6f\n",alpha);
		System.out.printf("beta:  %9.6f\n",beta);
		
		

	}

}
