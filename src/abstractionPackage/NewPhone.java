package abstractionPackage;

//this is after abstract class
public class NewPhone extends SmartPhone implements Phone  {
	
	// after we write extends hover over class name and select unimplemented methods
	public void sizeOfPhone() {
		System.out.println("This contains the size of the phone");
	}

	public void hardwareOfPhone() {
		System.out.println("This contains the hardware of the phone");
	}

	public void softwareOfPhone() {
		System.out.println("this contais the software of the phone");
	}

	public void on() {
		System.out.println("Phone turns on");
	}

	public void off() {
		System.out.println("Phone turns off");
	}

	public void touchscreen(String y) {
		System.out.println(y+ ": New Phone has touch screen");

		}

}
