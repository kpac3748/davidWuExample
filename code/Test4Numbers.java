package xxx;

public class Test4Numbers {
	
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			if (i % 4 == 0)
				System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i <= 100; i += 4)
			System.out.print(i + " ");
		
		System.out.println();
		
		for (int i = 0; i <= (100 / 4); i++)
			System.out.print(i * 4 + " ");
	}
	
	
}
