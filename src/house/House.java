package house;

public class House {
	String name;
	double height;
	
	public House(String name, double height) {
		this.name = name;
		this.height = height;
		System.out.println("house");
	}

	@Override
	public String toString() {
		return "House: name=" + this.name + ", height=" + this.height;
	}
}
