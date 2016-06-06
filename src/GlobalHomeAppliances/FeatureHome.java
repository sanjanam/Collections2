package GlobalHomeAppliances;

public class FeatureHome extends HomeAppliance{

	public FeatureHome(String brand,String ProductType,String model,int price){
		this.brand=brand;
		this.ProductType=ProductType;
		this.model=model;
		this.price=price;
	}
	
	
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Brand :" +brand);
		System.out.println("Product Type :" +ProductType);
		System.out.println("Model :" +model);
		System.out.println("Price :" +price);
		
	}

}
