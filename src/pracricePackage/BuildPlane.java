package pracricePackage;

public class BuildPlane extends PlaneModel implements Plane{

	@Override
	public void engine(String a) {
	System.out.println(a);	
	}

	@Override
	public void fanBlades(String b) {
	System.out.println("Plane has two blades");
	}

	@Override
	public void start() {
	}

	@Override
	public void stop() {
	}

	@Override
	public void fly() {
		System.out.println("Plane can fly");
	}

	@Override
	public void twoEngines(String c) {
		System.out.println("Plane has two engine");
	}

	@Override
	public void doubleDeck(String d) {
	System.out.println("Plane has two floors");	
	}

	@Override
	public void biggerPlane() {
		}

}
