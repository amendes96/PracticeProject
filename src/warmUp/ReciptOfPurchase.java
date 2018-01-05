package warmUp;

public class ReciptOfPurchase {

	public static void main(String[] args) {
		
		PriceReturn price = new PriceReturn();
		
		CreatingAMethod x = new CreatingAMethod();
		x.companyName("Sony");
		x.consoleName("Playstation");
		x.type("Playstation 4 Pro");
		x.date("11-24-2017  6:58PM");
		double cost1 = price.totalcost(299.99);
		
		System.out.println("---------------------------");
		
		CreatingAMethod2 y = new CreatingAMethod2();
		y.companyName("Microsoft");
		y.console("XBOX");
		y.type("XBOX X");
		y.date("11-24-2017  6:58PM");
		double cost2 = price.totalcost(349.99);
		System.out.println(cost2);
		
		System.out.println("---------------------------");
		
		System.out.println("Total Price: $" +(cost1+cost2));
		

	}

}
