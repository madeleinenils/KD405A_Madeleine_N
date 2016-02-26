

	public abstract class Mammal extends Animal{
		
		private int gestationTime;
		
		public Mammal(String latinName, int gestationTime){
			super (latinName);
			this.latinName = latinName;
			this.gestationTime = gestationTime;
		}
		
		public Mammal(String latinName){
			super(latinName);
		}
		
		public int getGestationTime(){
			return this.gestationTime;
		}
	}
