package hierarchy;

import java.util.ArrayList;

public class Firm {
	
	final String firmName;
	public double profit; 
	ArrayList<Individual> workers = new ArrayList<Individual>();
	public double cash;
	
	public Firm(String name){
		this.firmName = name;
	}

	
	
	private  double getTotalFixedSalary(){
		double sum = 0.0;
		for(Individual worker:this.workers){
			sum += worker.getSalary();
		}
		
		return sum/workers.size();
		}
	
	private  int getTotalTnure(){
		int sum = 0;
		for(Individual worker:this.workers){
			sum += worker.getTenure();
		}
		
		return sum;
		}
	
	
	
}
