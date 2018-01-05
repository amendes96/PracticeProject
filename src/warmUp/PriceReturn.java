package warmUp;

public class PriceReturn {
	
	double tax = 0.086;
	
	public double totalcost(double cost) {
		double finalCost =((cost*tax)+cost);
		System.out.println("Cost: $" +finalCost);
		return finalCost;
	}

}
