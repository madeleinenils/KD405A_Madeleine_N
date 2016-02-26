
	public class Snake extends Animal{
		
		private boolean poisonus;
		
		public Snake(String latinName, boolean poisonus){
			super(latinName);
			this.poisonus = poisonus;
			this.latinName = latinName;
			
		}
			
			public boolean isPoisonus(){
				return this.poisonus;
			}
			/**checks if snake is poisonous or not*/
			@Override
			public String getInfo(){
				String i = "";
				if(isPoisonus() == true){
					i = new String (" is poisonus");
				}
				else{
					i = new String(" is not poisonus");
				}
			return "The Snake " + getLatinName() + i;
		}
	}


