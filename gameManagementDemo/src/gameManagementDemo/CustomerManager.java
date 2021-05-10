package gameManagementDemo;

public class CustomerManager implements ICustomer {

	@Override
	public void add(Customer customer) {
		System.out.println("Kayýt Eklendi: " + customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kayýt Güncellendi: " + customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kayýt Silindi : " + customer.getFirstName());
		
	}

}
