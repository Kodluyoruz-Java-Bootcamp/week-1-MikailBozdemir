package onlineShopping;


public class Product {

	 String category;
	 String name ;
	 int price ;
	 int amountInStock;
	 
	 
	 
	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getAmountInStock() {
		return amountInStock;
	}



	public void setAmountInStock(int amountInStock) {
		this.amountInStock = amountInStock;
	}



	public Product(String category, String name, int price, int amountInStock) {
		super();
		this.category = category;
		this.name = name;
		this.price = price;
		this.amountInStock = amountInStock;
	}
	 
	 
	 
}
