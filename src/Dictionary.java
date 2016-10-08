
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

 
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
 
public class Dictionary {
 
    public static void main(String[] args) throws IOException{
        // 1. Initialize hashmap and arraylist
 
        Scanner inFile1 = new Scanner(new File("dictionary.txt")).useDelimiter("\n");
        ArrayList<String> s = new ArrayList<String>();
        
        HashMap h = new HashMap();
        
        // while loop
        while (inFile1.hasNext()) {
            // find next line
            String current = inFile1.next();
            // 2. Add to both hashmap and arraylist
            s.add(current);
            h.put(current, null);
        }
        inFile1.close();
        long startTime = System.nanoTime();
        // 3. Find the word "turtle" in the arraylist
        s.contains("turtle");
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(duration);
 
        startTime = System.nanoTime();
        // 4. Find the word "turtle" in the hashmap
        h.containsKey("turtle");
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(duration);
    }
}