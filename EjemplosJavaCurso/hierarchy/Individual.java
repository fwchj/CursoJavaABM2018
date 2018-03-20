package hierarchy;
public abstract class  Individual {
	double salary;
	final String name;
	int age;
	int tenure;
	final boolean female;
	static int countIndividuals = 0;
	Firm firm;
	

	
	Individual(double sal, String name, int age, int ten, boolean female,Firm firm){
		this.salary	 	= sal;
		this.name 		= name;
		this.age		= age;
		this.tenure 	= ten;
		this.female 	= female;
		this.firm 		= firm;
		firm.workers.add(this);
		
		
		countIndividuals++;
	}
	// Method describe displays basic info of the individual
	void describe(){
		System.out.printf("%s is %s years old, works since %s years in the company and earns a salary of %s\n",name,age,tenure,salary);
	}
	
	
	// GET-Method to return tenure
	int getTenure(){
		return this.tenure;
	}
	
	// GET-Method to return age
	int getAge(){
		return this.age;
	}
	
	// Set-Method to change the salary
	void setSalary(double salary){
			this.salary = salary;
		}
	
	// Returns the age at which the individual started working at the company
	int getAgeEntry(){
		return this.age-this.tenure;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	
	abstract double payEarnings();
	
	
	public void blabla(){
		//TODO: tengo que hacer eso
	}
	
	
	
}