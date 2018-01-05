package pracricePackage;

public class TestPhone {

	public static void main(String[] args) {
		System.out.println("FEATURES OF OLD PHONE");
		OldPhone oldPhones = new OldPhone();
		oldPhones.calling();
		oldPhones.texting();
		
	System.out.println("____________");
	
	System.out.println("FEATURES OF NEW PHONE");
		NewPhone newPhone = new NewPhone();
		newPhone.calling();
		newPhone.texting();
		newPhone.touchscreen();
		newPhone.playGames();
	}

}
