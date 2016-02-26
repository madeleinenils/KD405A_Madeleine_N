import java.util.ArrayList;

public class BikeStore {
	public static ArrayList<Bike> allBikes = new ArrayList<Bike>();
	
	
	public BikeStore(){
		allBikes.add(new Bike("red", 28, 3000));
	
	}
	
		public String getAllBikes(){
		
		String allMyBikes = "";
		
		for(Bike c : allBikes){
			
			allMyBikes = allMyBikes + "The bike is the color " + c.getColor() + " and the size " + c.getSize() + " and costs " + c.getPrice() + "kr" + "\n";
			
		}
		return allMyBikes;
	}
		public void addBike(String color, int size, int price){
			Bike c = new Bike(color, size, price);
			this.allBikes.add(c);
		}

	}

