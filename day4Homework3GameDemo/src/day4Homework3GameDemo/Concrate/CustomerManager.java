package day4Homework3GameDemo.Concrate;

import day4Homework3GameDemo.Abstracts.CustomerService;
import day4Homework3GameDemo.Entities.Customer;

public class CustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getNickName()+"Adli oyuncunun kaydi yapilmistir");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getId()+"Numaralı hesabın bilgileri günlelenmiştir");
		
	}

	@Override
	public void remove(Customer customer) {
		System.out.println(customer.getNickName()+"nickli oyuncu silinmiştir");
	
	}
	
}
