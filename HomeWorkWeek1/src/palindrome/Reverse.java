package palindrome;


import java.util.ArrayList;

public class Reverse {
	
	
		 ArrayList liste=new ArrayList();
		 long iter=10;
		 long sonuc;
		 char ch; 		 
		 public long reverse (long sayi)
		 {
			 String nstr ="";			 
			 String ters=Long.toString(sayi);
			 for (int j=0; j<ters.length(); j++)
		      {
		        ch= ters.charAt(j); 
		        nstr= ch+nstr; 		        
		      } 
			 sonuc=Long.parseLong(nstr)  ;
			 return sonuc;		 
		 }
		 
		
		public ArrayList listeolustur ( long asayi)
		{
			long g=reverse(asayi);
			long toplam=g+asayi;
			long f= reverse(toplam);
			
			if( f !=toplam)
			{
				liste.add(toplam);
				listeolustur(toplam);	
				
			}
				
			else if (f ==toplam)
			{
			liste.add(toplam);
			iter++;
			}
			
			return liste;
		}
}

