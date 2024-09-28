package excepationanderrorhandaling;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
	      ArrayList<String> mylist = new ArrayList<String>();
		
		//Add data in an ArrayList//
		
		mylist.add("Sam");
		mylist.add("Jhon");
		mylist.add("Pri");
		mylist.add("Mick");
		mylist.add("Rinu");
		
		System.out.println("Print the size of the ArrayList: " + mylist.size());
		
		Iterator<Object> it = mylist.iterator();
		
		while(it.hasNext());
		{
			System.out.println(it.next());
			
		}
		
		//Checking ArrayList is empty//
		
		System.out.println("Is ArrayList empty?" + mylist.isEmpty());//False
		
		//Remove all the elements//
		
		mylist.clear();
		
		System.out.println("Is ArrayList empty: "+mylist.isEmpty());
		
	}

}
