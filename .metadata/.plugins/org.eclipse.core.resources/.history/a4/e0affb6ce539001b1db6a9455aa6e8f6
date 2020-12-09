import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CSVTest {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\javawork\\student.csv");
		
		// eclipse的window -> preferences -> general -> workspace -> Text File Encoding的設定會影響Java執行的編碼設定
		// 若是檔案編碼與Java環境編碼一致, 即可得到正確內容
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		br.close();
		fr.close();
		
		// 因為csv檔為MS950編碼, 所以處理方式可從原始的byte資料讀進後
		// 利用InputStreamReader與指定編碼處理, 即可還原成正確的內容
		
//		FileInputStream fis = new FileInputStream(file);
//		InputStreamReader isr = new InputStreamReader(fis, "MS950");
//		BufferedReader br = new BufferedReader(isr);
//		
//		String str;
//		while ((str = br.readLine()) != null) {
//			System.out.println(str);
//		}
//		
//		br.close();
//		isr.close();
//		fis.close();
		
		
		
	}

}
