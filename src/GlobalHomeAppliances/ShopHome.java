package GlobalHomeAppliances;

import java.util.Scanner;

public class ShopHome {
	public static void main(String args[]){
		HomeShopee hs=new HomeShopee();
		hs.loadData();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the start range");
		int sr=s.nextInt();
		System.out.println("Enter the end range");
		int er=s.nextInt();
		hs.displayByPrice(sr,er);
		System.out.println("Enter the brand");
		Scanner s1=new Scanner(System.in);
		String b=s1.nextLine();
		hs.displayByBrand(b);
		s.close();
		s1.close();
		
	}

}
