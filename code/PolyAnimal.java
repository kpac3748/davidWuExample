package xxx;

public class PolyAnimal {

	public static void main(String[] args) {
		Animal[] obj = new Animal[3];
		obj[0] = new Animal(2, 5.0f);
		obj[1] = new Elephant(5, 1200.0f, "David");
		obj[2] = new Elephant(10, 2000.0f, "James");
		
		for (int i = 0; i < obj.length; i++) {
			obj[i].speak();
			System.out.println("=============");
		}
	}

}
