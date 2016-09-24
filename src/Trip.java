import java.util.ArrayList;

public class Trip {
	ArrayList<Flight> flight = new ArrayList<Flight>();

	public void add(Flight f) {
		flight.add(f);
	}

	public int getNumberOfFlights() {
		return flight.size();
	}

	public void clear() {
		flight.clear();
	}

	public int getDuration() {
		int lastEnd = flight.size();
		int total = 0;
		if (flight.size() == 0) {
			return total;
		} else {
			Time start = flight.get(0).getDepartureTime();
			Time end = flight.get(lastEnd - 1).getArrivalTime();
			total += start.minutesUntil(end);
			return total;
		}
	}

	public int getShortestLayover() {
		int leastminutes = -1;
		int thisMinutes;
		int i = 0;
		for (Flight f : flight) {
			if (i != flight.size() - 1) {
				Time start = flight.get(i + 1).getDepartureTime();
				Time end = flight.get(i).getArrivalTime();
				thisMinutes = end.minutesUntil(start);
				if (leastminutes == -1) {
					leastminutes = thisMinutes + 1;
				}
				if (thisMinutes < leastminutes) {
					leastminutes = thisMinutes;
				}
			}
			i++;
		}
		return leastminutes;
	}
}
