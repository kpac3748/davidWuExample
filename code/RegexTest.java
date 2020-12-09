import java.util.Scanner;

public class RegexTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input ID:");
		String id = sc.next().toUpperCase();
		sc.close();
		
		// 參考java.util.regex.Pattern類別裡的說明
		String regex = "^[A-Za-z][12]\\d{8}$";
		if (id.matches(regex)) {
			System.out.println("OK");
		} else {
			System.out.println("No good...");
		}
		
	}

}
