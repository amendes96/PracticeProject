package pracricePackage;

public class MainPlane {

	public static void main(String[] args) {
		
		//used encapsulation
		PlaneInfo planesinfo = new PlaneInfo();
		planesinfo.setPlaneName("Boeing");
		planesinfo.setPlaneModel("947");
		planesinfo.setPlaneType("Passenger Plane");
		planesinfo.setPlaneColor("White");
		System.out.println("Planes Info: " + planesinfo.getPlaneName() + " , " + planesinfo.getPlaneModel() + " , " + planesinfo.getPlaneType()
		+ " , " + planesinfo.getPlaneColor());
		
		System.out.println("_______________");
		
		//used abstraction
		BuildPlane planedetails = new BuildPlane();
		planedetails.engine("Dual Engines");
		planedetails.doubleDeck("Two Floors");
		planedetails.start();
		planedetails.stop();
		planedetails.fly();
	}

}
