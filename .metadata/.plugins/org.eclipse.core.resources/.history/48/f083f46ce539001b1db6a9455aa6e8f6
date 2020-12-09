
public class TestDeepCopy {

	public static void main(String[] args) {
		Animal a1 = new Animal(2, 5.0f);
		Animal a2 = new Animal(10, 200.0f);
		
		Animal[] animals = new Animal[2];
		animals[0] = a1;
		animals[1] = a2;
		
		Animal[] animals2 = new Animal[animals.length];
		for (int i = 0; i < animals.length; i++) {
			Animal a = animals[i];
			int age = a.getAge();
			float weight = a.getWeight();
			Animal animal = new Animal(age, weight);
			animals2[i] = animal;
		}
		
		animals[0].setAge(5);
		
		System.out.println(animals[0].getAge());
		System.out.println(animals2[0].getAge());
	}

}
