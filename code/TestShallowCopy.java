
public class TestShallowCopy {

	public static void main(String[] args) {
		// 陣列為基本型別時, 複製的是值, 所以沒有修改的風險發生
//		int[] iArray = {1, 2, 3};
//		int[] iArray2 = iArray.clone();
//		
//		iArray[0] = 0;
//		
//		System.out.println(iArray[0]);
//		System.out.println(iArray2[0]);
		// 陣列為類別型別時, 複製的是位址, 即為同一個物件, 發生修改的情況
		Animal a1 = new Animal(2, 5.0f);
		Animal a2 = new Animal(10, 200.0f);
		
		Animal[] animals = new Animal[2];
		animals[0] = a1;
		animals[1] = a2;
		
		Animal[] animals2 = animals.clone();
		animals[0].setAge(5);
		
		System.out.println(animals[0].getAge());
		System.out.println(animals2[0].getAge());
		
		
		
		
	}

}
