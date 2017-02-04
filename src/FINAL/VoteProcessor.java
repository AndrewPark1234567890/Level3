package FINAL;
import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		String winner = "0";
		int pope = 0;
		int snow = 0;
		for (String s : votes) {
			s = s.toLowerCase();
			//System.out.println(s);
			if (s.equals("pope francis")) {
				pope++;
		
			}
			if (s.equals("edward snowden")) {
				snow++;
			}
		}
		//System.out.println(pope);
		//System.out.println(snow);
		if (pope < snow) {
			winner = "edward snowden";
		}else 	if (pope > snow) {
			winner = "pope francis";
		}
		else if (pope == snow) {
			winner = "TIE";
		}
		return winner;
	}

}
