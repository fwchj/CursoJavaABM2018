package hierarchy;

import java.util.ArrayList;

public class Owner extends Individual {
	
	private double stocks;
	ArrayList<Individual> subordinates = new ArrayList<Individual>();
	
	
	// Constructor
	public Owner(double sal, String name, int age, int ten, boolean female,Firm firm,double stocks){
		super( sal,  name,  age,  ten,  female,firm); // here we explicitly invoke the contructor of Indiidual
		this.stocks = stocks;
	}
	
	double getStocks(){
		return this.stocks;
	}
	
	// Method describe displays basic info of the individual
		void describe(){
			System.out.printf("%s is %s years old, works since %s years in the company and earns a salary of %s. %s is the big boss!\n",name,age,tenure,salary,name);
		}

		double payEarnings() {
			if(this.firm.profit>0){
				return this.firm.profit *0.8;
			}
			else{
				return 0.0;
			}
		}

}
