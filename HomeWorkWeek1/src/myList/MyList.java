package myList;

import java.util.Arrays;

public class MyList {

	int sayac = 0;
	int ilkboyut=5;
	private String[] mylist = new String[ilkboyut];

	public int getIlkboyut() {
		return ilkboyut;
	}

	public void setIlkboyut(int ilkboyut) {
		this.ilkboyut = ilkboyut;
	}

	public void add(String eleman) {

		if (sayac == mylist.length)
		{
			mylist = Arrays.copyOf(mylist, sayac + 7);
			
		}
		
		eleman = eleman.trim();
		if (eleman.charAt(0) == 'C' ||eleman.charAt(0) == 'c' )
		{
			mylist[sayac] = eleman;
			sayac++;
		}

	}

	public void print() {
		for (int i = 0; i < mylist.length; i++) {
			if(mylist[i]!=null)
			System.out.println( i+1+ ":"+mylist[i]);
		}

	}

}
