package gameManagementDemo;

public class Verification implements IReCaptcha {

	@Override
	public void verification(Customer customer) {
		System.out.println("Kimlik doğrulandı: " + customer.getFirstName() + " " + customer.getLastName());
		
	}

}
