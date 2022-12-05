package onlineShopping;


public class Invoice {
     
	 int totalPrice;
	 
	 public int printInvoice(Order order) {
		 
		 
		 order.orderList.forEach(product->totalPrice+= product.getPrice());
		 return totalPrice;
	 }
}
