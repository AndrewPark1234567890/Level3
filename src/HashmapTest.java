import java.util.HashMap;

public class HashmapTest {
public static void main(String[] args) {
	HashMap map = new HashMap();
	map.put("Eli", "Pasta");
	map.put("Andrew", "Quesadilla");
	map.put("Olivia", "pizza");
	map.put("Inferior andrew", "masala");
	System.out.println(getFavoriteFood("Eli", map));
	replaceFavoriteFood("Eli", "Soup", map);
	System.out.println(getFavoriteFood("Eli", map));
	System.out.println("DOES ANYONE LIKE PIZZA??? " + doesAnyoneLike("pizza", map));
}
public static String getFavoriteFood(String name, HashMap map){
	String fav = (String) map.get(name);
	return fav;
}
public static void replaceFavoriteFood(String name, String newFavFood, HashMap map){
	map.put(name, newFavFood);
}
public static boolean doesAnyoneLike(String food, HashMap map){
	if(map.containsValue(food)){
		return true;
	}else{
		return false;
	}
	}
}
