import java.util.HashMap;

import javax.management.MalformedObjectNameException;

public class ElimDups {
	static char[] cherry = new char[8];

	public static void main(String[] args) {
		cherry[0] = 'a';
		cherry[1] = 'b';
		cherry[2] = 'd';
		cherry[3] = 'e';
		cherry[4] = 'c';
		cherry[5] = 'a';
		cherry[6] = 'c';
		cherry[7] = 'c';
		System.out.println(removeDuplicates(cherry));
	}

	public static char[] removeDuplicates(char[] cherry){
		HashMap h = new HashMap();
		
		for(char s: cherry){
				for(char c: cherry){
					if(c==s){
					}else{
						h.put(c,1);
					}
		}}
		h.put(cherry[0],1);
		char[] berry = new char[h.size()];
		int i = 0;
		for(Object l: h.keySet()){
			berry[i] = (char)l;
			i++;
		}
		return berry;
	}
}
