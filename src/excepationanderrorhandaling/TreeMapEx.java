package excepationanderrorhandaling;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap = new TreeMap<>();
		tmap.put(101, "Sam");
		tmap.put(102, "Ram");
		tmap.put(103, "Jhon");
		tmap.descendingMap();
		
		System.out.println("Printing the values : "+tmap.descendingMap());
		

	}

}
