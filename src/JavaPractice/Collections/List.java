package JavaPractice.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class List {

	public static void main(String[] args) {
		
		
		/**he List interface is part of the Java Collections Framework and represents an ordered collection of elements.
		You can access elements by their index, add duplicates, and maintain the insertion order.
		Since List is an interface, you cannot create a List object directly.
		Instead, you use a class that implements the List interface, such as:
		ArrayList - like a resizable array with fast random access
		LinkedList - like a train of cars you can easily attach or remove  **/
		
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("kia");
		cars.add("tata");
		cars.add("maruthi");
		System.out.println(cars);
		
		Collections.sort(cars);
		Collections.rotate(cars, 2);
		
		System.out.println(cars);	
		
		
		 for (int i = 0; i < cars.size(); i++) {
		      System.out.println(cars.get(i));
		    }
		 
		 ArrayList<String> fcar = new ArrayList<String>();
		 fcar.add("BMW");
		 fcar.add("Ford");
		 fcar.add("Mazda");
		    for (String i : fcar) {
		      System.out.println(i);
		    }
		    
		 ArrayList<String> globalcar = new ArrayList<String>();  
		 
		 globalcar.addAll(cars);
		 globalcar.addAll(fcar);
		 
		 Collections.sort(globalcar);
		 System.out.println(globalcar);

		    
		    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		    myNumbers.add(10);
		    myNumbers.add(15);
		    myNumbers.add(20);
		    myNumbers.add(25);
		    for (int i : myNumbers) {
		      System.out.println(i);
		    }
	
			
			
		    
		
		

	}

}
