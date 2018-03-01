package Exercises;
public class Time {

	public static void main(String[] args) {
		long totalMilliseconds = System.currentTimeMillis();
		
		totalMilliseconds -=1000*60*60*6;
		long seconds = totalMilliseconds / 1000 % 60;
		long minutes = totalMilliseconds / 1000 / 60 % 60;
		long hours = totalMilliseconds / 1000 / 60 / 60 % 24;
		
		System.out.printf("It is %s:%s:%s (Mexico City Time)\n",hours,minutes,seconds);
		
		
		

	}

}
