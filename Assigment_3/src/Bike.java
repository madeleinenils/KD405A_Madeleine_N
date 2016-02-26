public class Bike {
	private String color;
	private int price;
	private int size;
	
	/**skapar Bike med variablerna color och size*/
	public Bike(String color, int size){
		
		this.color = color;
		this.size = size;
		
	}

	public Bike(String color, int size, int price){
		
		this.color = color;
		this.size = size;
		this.price = price;
		
	}
	/** hämtar färgen på Bike*/
	public String getColor(){
		return this.color;
	}
	/** hämtar size på Bike*/
	public int getSize(){
		return this.size;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public void setPrice(int price){
		this.price = price;
	}

}