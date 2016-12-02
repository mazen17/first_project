package house;

import java.util.ArrayList;
import java.util.List;

public class App {

	/**
	 * @param args
	 */
	
	 public static void main(String[] args) {
		 System.out.println("start");
		 
		 House h1 = new House("h1", 10);
		 House h2 = new House("h2", 20);
		 
		 House h3 = h2;
		 h3.name = "h3";
		 
		 System.out.println(h1.toString());
		 System.out.println(h2.toString());
		 System.out.println(h3.toString());
		 
		 List<House> houses = new ArrayList<House>();
		 houses.add(h1);
		 houses.add(h2);
		 houses.add(h3);
		 
		 Garden g1 = new Garden(100, houses);
		 System.out.println(g1);
		 
		 System.out.println("end");
	}

}
