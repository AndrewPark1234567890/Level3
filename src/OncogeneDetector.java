import java.rmi.RemoteException;
import java.util.ArrayList;

public class OncogeneDetector {

	public boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequences, String string) {
		int healthNums = 0;
		int cancerNums = 0;
		if(string.equals("")){
			throw new IllegalArgumentException("healthySequences must contain at least one element");
			throw new IllegalArgumentException("cancerSequences must contain at least one element");
		}
		for (int i = 0; i < healthySequences.size(); i++) {
			String str = healthySequences.get(i);
			for (int j = 0; j < str.length(); j++) {
				if (j + 3 > str.length()) {
					break;
				}
				if (string.equals(str.substring(j, j + string.length()))) {
					healthNums +=1;
					break;
				}
			}
		}
		for (int y = 0; y < cancerSequences.size(); y++) {
			String stri = cancerSequences.get(y);
			for (int z = 0; z < stri.length(); z++) {
				if (z + 3 > stri.length()) {
					break;
				}
				if (string.equals(stri.substring(z, z + string.length()))) {
					cancerNums +=1;
					break;
				}
			}
		}

		if(healthNums < cancerNums){
			return true;
		}else if (healthNums > cancerNums){
			return false;
		}else{
			return false;
		}
	}

}
