

	public class Dog extends Mammal {
		private boolean stupid;

		public Dog(String latinName, int gestationTime, boolean stupid) {
			super(latinName, gestationTime);
			this.latinName = latinName;
			this.stupid = stupid;

		}

		public Dog(String latinName, boolean stupid, String friendlyName) {
			super(latinName);
			this.latinName = latinName;
			this.stupid = stupid;
			this.friendlyName = friendlyName;
		}

		public boolean isStupid() {
			return this.stupid;
		}
	/**checks if dog is stupid or not*/
	public String getInfo(){
		String i = "";
		if(isStupid() == true){
			i = new String (" is stupid");
		}
		else{
			i = new String(" is not stupid");
		}
		if(getLatinName() != null){
			
	return"The dog " + getFriendlyName() + "lat:" + getLatinName() + " gestation: " + getGestationTime() + i;
	}else{
		return "The dog " + getFriendlyName() + "gestation: " + getGestationTime() + i;
	}
	}

	

}
