package onlineShopping;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	Invoice invoice =new Invoice();
	
   	List <Product> orderList= new ArrayList<>(); 
	
	
	
	public void add( Product product) {
		orderList.add(product);
	
	}

}
