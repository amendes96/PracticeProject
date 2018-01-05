package abstractionPackage;

public class TestPhone {

	public static void main(String[] args) {
		
		//can access all methods from interface and abstract and therefore we can access all of the methods
		NewPhone iphone = new NewPhone();
		iphone.call("iPhone");
		iphone.touchscreen("iPhone");
		
		//can only access methods in phone interface
		Phone nokia = new NewPhone();
		nokia.on();
		nokia.off();
		
		//can only access methods from Smartphone abstract class
		SmartPhone blackberry = new NewPhone();
		blackberry.softwareOfPhone();
		blackberry.hardwareOfPhone();
	}

}
