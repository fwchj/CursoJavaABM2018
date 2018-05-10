import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GroupOrder {

	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=5;i++){
			list.add(i);
		}
		
		Collections.shuffle(list, new Random(9));

		for(int g:list){
			System.out.printf("Group %s\n",g);
		}
	}

}
