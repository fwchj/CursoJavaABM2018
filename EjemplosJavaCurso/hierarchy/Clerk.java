package hierarchy;

public class Clerk extends Individual{
	
	Individual boss;
	String function;
	
	public Clerk (double sal, String name, int age, int ten, boolean female,Firm firm,Director boss,String function){
		super(sal,name,age,ten,female, firm); 
		this.boss = boss;
		this.function = function;
		boss.addSubordinates(this);
		

		}

	
	double payEarnings() {
		// For clerks, the payment is simply the salary
		return this.salary;
		
	}
	
	
	

}
