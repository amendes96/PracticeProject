package abstractionPackage;
//this is after interface is intitated
public abstract class SmartPhone implements Phone {

	// we are implementing this from Phone interface
	// ((((public void sizeOfPhone();
	// public void hardwareOfPhone();
	// public void softwareOfPhone();
	// public void on();
	// public void off();))))

	public void call(String x) {
		System.out.println(x + ": some years later phones got a camera");
	}
	public void message() {
		System.out.println("we can also send messages");
	}
	
	//In this method we are just creating a roadmap or prototype for our next phone
	public abstract void touchscreen(String y);
	}

