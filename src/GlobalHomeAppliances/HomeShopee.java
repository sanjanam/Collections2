package GlobalHomeAppliances;



public class HomeShopee {
	
	
	FeatureHome fhl[]=new FeatureHome[5];
	SmartKitchen skl[]=new SmartKitchen[5];
	
	void loadData(){
		fhl[0]=new FeatureHome("Samsung","WashingMachine","8001",2010);
		fhl[1]=new FeatureHome("LG","Television","palsma",24000);
		fhl[2]=new FeatureHome("LG","washing machine","BLOOM WASH 701H",22000);
		fhl[3]=new FeatureHome("Samsung","Laptop","8001",2010);
		fhl[4]=new FeatureHome("LG","Television","3D TV",24000);
		
		skl[0]=new SmartKitchen("Samsung","DishWasher","8001",2010);
		skl[1]=new SmartKitchen("IFB","microoven","20L connection oven",10000);
		skl[2]=new SmartKitchen("Godrej","pressure cooker","2GLB",15000);
		skl[3]=new SmartKitchen("LG","Stove","2 connections",23000);
		skl[4]=new SmartKitchen("Samsung","Refrigirator","8001",2010);
		
	}
	void displayByPrice(int startRange, int endRange){
	for(int i=0;i<5;i++){
		if(fhl[i].price>startRange && fhl[i].price<endRange){
			System.out.println("Brand :"+fhl[i].brand);
			System.out.println("ProductType :"+fhl[i].ProductType);
			System.out.println("Model :"+fhl[i].model);
			System.out.println("Price :"+fhl[i].price);
		}
	
		if(skl[i].price>startRange && skl[i].price<endRange){
			System.out.println("Brand :"+skl[i].brand);
			System.out.println("ProductType :"+skl[i].ProductType);
			System.out.println("Model :"+skl[i].model);
			System.out.println("Price :"+skl[i].price);
		}
	}	
	}
	void displayByBrand(String b){
		for(int i=0;i<5;i++){
			if(fhl[i].brand.equalsIgnoreCase(b)){
				System.out.println("Brand :"+fhl[i].brand);
				System.out.println("ProductType :"+fhl[i].ProductType);
				System.out.println("Model :"+fhl[i].model);
				System.out.println("Price :"+fhl[i].price);
			}
			
				if(skl[i].brand.equalsIgnoreCase(b)){
					System.out.println("Brand :"+skl[i].brand);
					System.out.println("ProductType :"+skl[i].ProductType);
					System.out.println("Model :"+skl[i].model);
					System.out.println("Price :"+skl[i].price);
				}
			}	
		}
	
	
}
