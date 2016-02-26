import java.util.ArrayList;

public class Main {
	
	public static ArrayList<Bike> allBikes = new ArrayList<Bike>();

	public static void main(String[] args) {
		
			allBikes = new ArrayList<Bike>();
			Bike bike1 = new Bike("red", 10, 2000);
			allBikes.add(bike1);
			Bike bike2 = new Bike("blue", 15, 1300);
			allBikes.add(bike2);
			Bike bike3 = new Bike("green", 28, 8000);
			allBikes.add(bike3);
			Bike bike4 = new Bike("pink", 17, 10500);
			allBikes.add(bike4);
			Bike bike5 = new Bike("purple", 50, 6200);
			allBikes.add(bike5);
			Bike bike6 = new Bike("yellow", 8, 1300);
			allBikes.add(bike6);
			Bike bike7 = new Bike("white", 21, 5000);
			allBikes.add(bike7);
			Bike bike8 = new Bike("black", 27, 20000);
			allBikes.add(bike8);
			Bike bike9 = new Bike("orange", 13, 15000);
			allBikes.add(bike9);
			Bike bike10 = new Bike("gray", 9, 4000);
			allBikes.add(bike10);
			
			
			
		for(Bike bike : allBikes){
			
			System.out.println("The bike is  " + String.valueOf(bike.getColor()) + " and is " + String.valueOf(bike.getSize()) + " in size " + "and costs " + String.valueOf(bike.getPrice()));
			
			if(bike.getPrice() < Constants.getMinPrice() || bike.getPrice() > Constants.getMaxPrice()){
				System.out.println("Priset " + bike.getPrice() + " �r fel" + "\n");
			}
			if(bike.getSize() < Constants.getMinSize() || bike.getSize() > Constants.getMaxSize()){
				System.out.println("Storleken " + bike.getSize() + " �r fel" + "\n");
			}
		}

	}


}