package onlineShopping;

import java.util.ArrayList;
import java.util.List;

import myList.MyList;
import palindrome.Reverse;

public class Main {

	public static void main(String[] args) {
		
		Invoice invoice = new Invoice();
		Order order = new Order();

		Customer customer1 = new Customer("cem", "atay", 52);
		Customer customer2 = new Customer("mikail", "bozdemir", 24);
		Customer customer3 = new Customer("ali", "büyük", 24);
		Customer customer4 = new Customer("cem", "salman", 29);
		Customer customer5 = new Customer("cem", "arı", 24);

		Product product1 = new Product("teknoloji", "cep telefonu", 15000, 8);
		Product product2 = new Product("sağlık", "ağrı kesici", 15, 10);
		Product product3 = new Product("giyim", "kot pantolon", 150, 500);
		Product product4 = new Product("aksesuar", "saat", 200, 18);
		Product product5 = new Product("spor", "futbol topu", 200, 20);
		Product product6 = new Product("kitap", "soru bankası", 200, 18);
		Product product7 = new Product("müzik", " keman", 2000, 20);

		customer1.order.add(product1);
		customer1.order.add(product2);

		customer2.order.add(product1);
		customer2.order.add(product7);

		customer3.order.add(product3);
		customer3.order.add(product5);

		customer4.order.add(product3);

		customer5.order.add(product5);
		customer5.order.add(product2);
		customer5.order.add(product3);

		// müşteriler kaydedildi
		Customer.save(customer1);
		Customer.save(customer2);
		Customer.save(customer3);
		Customer.save(customer4);
		Customer.save(customer5);

		// sistemdeki müşteri sayısı
		System.out.println("Sistemdeki  kayıtlı müşteri sayısı " + Customer.customerList.size() + " dır");

		// ismi cem olan müşterilerin aldıkları ürün sayısı
		Customer.customerList.stream().filter(customer -> customer.getName().equals("cem"))
				.forEach(cutomer -> System.out.println(cutomer.order.orderList.size()));

		// yaşı 25 ile 30 arası olan cemlerin fatura tutarları
		Customer.customerList.stream().filter(customer -> customer.getName().equals("cem"))
				.filter(customer -> 25 < customer.getAge() && 30 > customer.getAge())
				.forEach(customer -> System.out.println(customer.order.invoice.printInvoice(customer.order)));

		Customer.customerList.stream()
				.forEach(customer -> System.out.println(customer.order.invoice.printInvoice(customer.order)));

	System.out.println("*************************************************************************************************************");
		
		// 9 SORU MYLİST İÇİN
	
		  MyList liste=new MyList();
		 
		  liste.add("Cemal"); 
		  liste.add("canlı");
		  liste.add(" Cüneyt");
		  liste.add("malzeme");
		  liste.add("Cemal");
		  liste.add("canlı");
		  liste.add(" Cemal"); 
		  liste.add("canlı"); 
		  liste.add("Cemal");
		  liste.add("Cemal"); 
		  liste.add("memal");
		  liste.add("Cemal"); 
		  liste.add("Cemal"); 
		  liste.add("Cemal");
		  liste.add("Cemal");
		  
		  liste.print();
		 
		 
	System.out.println("*************************************************************************************************************");
		
		//1. SORU Kodu
		
		
		ArrayList seri = new ArrayList();
		ArrayList asılliste = new ArrayList();
		Reverse rvr = new Reverse();

		for (int i = 10; i < 101; i++) {

			seri = rvr.listeolustur(i);

			if (seri.size() > asılliste.size()) {
				asılliste = (ArrayList) seri.clone();

			}
			seri.clear();
		}
		System.out.println(asılliste +  "\n"+ "serinin uzunluğu=" + asılliste.size());
		
	System.out.println("*************************************************************************************************************");
		
		//2. soru kodu
		
		int i=6;
		int a;
		for(a=1;a<i;a++)
		{
			
			
		
		for (int j=0;j<a;j++)
		{
			System.out.print("*");
			
		}
		for(int b=2*a;b<2*i;b++)
		{
			System.out.print(" ");
		}
		for (int j=0;j<a;j++)
		{
			System.out.print("*");
			
		}
		System.out.println(" ");
		
		}
		
		
	}

}
