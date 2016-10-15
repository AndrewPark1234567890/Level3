import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;

public class AnimalHipster {

	public AbstractCollection<String> findAnimalHipsters(HashMap<String, ArrayList<String>> network, HashMap<String, String> favoriteAnimals) {
		AbstractCollection<String> acos = new ArrayList<String>();
		boolean isHip = true;
		for (String people : network.keySet()) {
			String curFav = favoriteAnimals.get(people);
			for (String friendname: network.get(people)) {
				if (favoriteAnimals.get(friendname) == curFav) {
					isHip = false;
				}
			}
			if (isHip == true) {
				acos.add(people);
			}
			isHip = true;
		}
		return acos;
	}

}
