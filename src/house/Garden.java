package house;

import java.util.List;

public class Garden {
	double area;
	List<House> houses;
	
	public Garden(int area, List<House> houses) {
		this.area = area;
		this.houses = houses;
	}
	
	@Override
	public String toString() {
		return "Garden: " + houses.toString();
	}

}
