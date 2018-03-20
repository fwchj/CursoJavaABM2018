package hierarchy;

import java.util.ArrayList;
import java.util.HashMap;

public class Director extends Individual{
	
	Individual boss;
	ArrayList<Individual> subordinates = new ArrayList<Individual>();
	String division;
	
	HashMap<Individual,String> sub = new HashMap<Individual,String>();
	
	
	
	
	public Director (double sal, String name, int age, int ten, boolean female,Firm firm,Individual boss,String division){
		super(sal,name,age,ten,female,firm);
		this.boss = boss;
		this.division = division;
	}

	public void addSubordinates(Clerk clerk) {
		this.subordinates.add(clerk);
		
		
	}

	
	double payEarnings() {
		if(this.firm.profit>1000000){
			return 1.5*this.salary;
		}
		else{
			return this.salary;
		}
	}
	
	
	void presentDivision(){
		System.out.printf("The division '%s' is directed by '%s'\n", this.division,this.name);
		System.out.println("The following workers are working in the division:");
		for(Individual c:this.subordinates){
			c.describe();
		}
	}
	
	

}
