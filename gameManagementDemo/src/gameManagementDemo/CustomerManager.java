package gameManagementDemo;

public class CustomerManager implements ICustomer {

	@Override
	public void add(Customer customer) {
		System.out.println("Kay�t Eklendi: " + customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kay�t G�ncellendi: " + customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kay�t Silindi : " + customer.getFirstName());
		
	}

}
