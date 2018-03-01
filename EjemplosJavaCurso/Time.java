public class Time {

	public static void main(String[] args) {
		// Obtain the miliseconds since 01/01/1970
		long totalMilliseconds = System.currentTimeMillis();
		
		// Substract 6 hours to get CDMX time
		totalMilliseconds -=1000*60*60*6;
		
		// Convert the miliseconds in second, minutes and hours
		long seconds = totalMilliseconds / 1000 % 60;
		long minutes = totalMilliseconds / 1000 / 60 % 60;
		long hours = totalMilliseconds / 1000 / 60 / 60 % 24;
		
		//Display the result
		System.out.printf("It is %s:%s:%s (Mexico City Time)\n",hours,minutes,seconds);
		
		
		

	}

}
