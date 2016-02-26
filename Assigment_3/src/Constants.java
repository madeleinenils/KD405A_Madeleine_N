public class Constants {
	
	public static final int MIN_SIZE = 8;
	public static final int MAX_SIZE = 28;
	public static final int MIN_PRICE = 0;
	public static final int MAX_PRICE = 30000;
	
	
	public static final String[] colors = new String[]{"blue", "red", "yellow", "pink", "green", "white", "purple", "black"};
	

	public static int getMinSize(){
		return MIN_SIZE;
	}
	
	public static int getMaxSize(){
		return MAX_SIZE;
	}
	/** gets lowest allowed price on Bike*/
	public static int getMinPrice(){
		return MIN_PRICE;
	}
	/** gets largest allowed price on Bike*/
	public static int getMaxPrice(){
		return MAX_PRICE;
	}
	/** get array of allowed colors*/
	public static String[] getColors(){
		return colors;
	}

}