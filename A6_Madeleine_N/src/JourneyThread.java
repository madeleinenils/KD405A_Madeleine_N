import java.util.Calendar;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class JourneyThread extends Thread {
	private SkaneGUI gui;
	private Parser parser;

	public JourneyThread(Parser p, SkaneGUI g) {
		this.gui = g;
		this.parser = p;

	
	}

public void run(){
	gui.textArea_2.setText("Searching...");
	String searchURL = Constants.getURL(gui.fromField.getText(),gui.toField.getText(),1);
	Journeys journeys = Parser.getJourneys(searchURL);

	for (Journey journey: journeys.getJourneys()){
		gui.textArea_2.setText(journey.getStartStation()+ "-");
		gui.textArea_2.append(journey.getEndStation()+ ":");
		gui.textArea_2.append(journey.getLineOnFirstJourney()+ " ");
		String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+ journey.getDepDateTime().get(Calendar.MINUTE);
		gui.textArea_2.append("\n Departs"+time+" in " + journey.getTimeToDeparture()+"minutes"+"\n It is " + journey.getDepTimeDeviation()+"minutes late");
	}
}
}
