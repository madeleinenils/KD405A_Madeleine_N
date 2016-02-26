public class TestBikeStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BikeStore bikeStore = new BikeStore();
		bikeStore.addBike("red", 28, 3000);
		System.out.print(bikeStore.getAllBikes());
		

	}

}