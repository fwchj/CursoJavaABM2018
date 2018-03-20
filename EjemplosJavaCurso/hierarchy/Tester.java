package hierarchy;

public class Tester {

	public static void main(String[] args) {
		Firm myfirm = new Firm("test");
		Owner jane = new Owner(15000,"Jane",55,30,true,myfirm,150);
		
		System.out.println(Individual.countIndividuals);
		
		Owner jane2 = new Owner(15000,"Jane2",55,30,true,myfirm,150);
		System.out.println(Individual.countIndividuals);

		System.out.println(jane.countIndividuals);
	}

}
