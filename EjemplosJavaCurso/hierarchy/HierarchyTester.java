package hierarchy;
 
public class HierarchyTester {

	public static void main(String[] args) {

		
		// Create the firm first
		Firm myfirm = new Firm("MyFirm Inc.");
		
		
		// Create the boss: 
		Owner jane = new Owner(15000,"Jane",55,30,true,myfirm,150);
		
		// Create the two directors:
		Director jack = new Director(12000,"Jack",50,24,false,myfirm,jane,"Sales");
		Director laura = new Director(11800,"Laura",42,17,true,myfirm,jane,"R&D");
		jane.subordinates.add(jack);
		jane.subordinates.add(laura);
		
		
		
		// Create workers
		Individual john  = new Clerk(4559.59, "John", 35,5, false,myfirm,jack,"Junior sales manager");
		Individual paula = new Clerk(8594.60, "Paula", 35,8, false,myfirm,jack,"Senior sales manager");
		
		Individual stuart  = new Clerk(6953, "Stuart", 28,4, false,myfirm,laura,"Product engineer");
		Individual kelly  = new Clerk(7506, "Kelly", 43,15, false,myfirm,laura,"Senior Product engineer");
		
		
		jack.presentDivision();
		
		myfirm.profit = 1200000;
		
		for(Individual worker:myfirm.workers){ // We can refer to Individual without knowing the exact type
			myfirm.cash -= worker.payEarnings();
		}
		
		
		
		
	}
}
