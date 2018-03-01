

public class WhileExample {

	public static void main(String[] args) {
		
		// Example 1: while
		int x = 1;
		while(x<500){
			x*=2;
		}
		System.out.printf("x = %s\n",x);
	
		// Example2: do-while
		double y = 10;
		do{
			y /=2;
			
		}while(y/2>0.5);
		System.out.printf("y = %s\n", y);
		
		// Example3: for-loop
		double j = 0;
		for(int i = 28;i>0;i--){
			j = Math.sqrt(i);
			if(j%1 ==0){
				break;
			}
		}
		System.out.printf("j = %s",j);
	}

}
