import java.util.ArrayList;

import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class StationThread extends Thread{

	private SkaneGUI gui;
	private Parser parser;
	
	
	
	public StationThread(Parser p,SkaneGUI g) {
		this.parser = p;
		this.gui = g;
		
					
	}
public void run(){
	gui.textArea1.setText("Searching..");
	gui.stations = new ArrayList<Station>();
	gui.stations.addAll(Parser.getStationsFromURL(gui.Searchfield.getText()));
	
	for (Station s:gui.stations){
		gui.textArea1.append(s.getStationName()+" number:"+ s.getStationNbr()+ "\n");
	}
}
}
