
	public class Cat extends Mammal {
		
		private int numberOfLives;
		
		public Cat(String latinName, int numberOfLives, int gestationTime){
			super (latinName, gestationTime);
			this.latinName = latinName;
			this.numberOfLives = numberOfLives;
		}
		
		public void setNumberOfLives(int i){
			this.numberOfLives = i;
		}
		
		public int getNumberOfLives(){
			return this.numberOfLives;
		}
		

		
		public String getInfo(){
			return "The cat " + getLatinName() + " has " + getNumberOfLives() + " lives";
		}
	

}
