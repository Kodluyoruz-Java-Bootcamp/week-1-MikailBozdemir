package onlineShopping;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
    Order order  =new Order();
    
	String name ;
	String surname ;
	int age;
	     
	
	
	 static List<Customer> customerList=new ArrayList<>();


	public Customer(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	
	}
	
	
	public static  void  save(Customer  customer) {
		customerList.add(customer);
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	


}
