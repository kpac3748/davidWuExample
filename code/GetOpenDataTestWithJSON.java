import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GetOpenDataTestWithJSON {
	private static final String MY_URL = "http://data.tycg.gov.tw/api/v1/rest/datastore/a1b4714b-3b75-4ff8-a8f2-cc377e4eaa0f?format=json";
	
	public static void main(String[] args) throws IOException, JSONException {
		URL url = new URL(MY_URL);
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		
		InputStream is = con.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		StringBuilder sb = new StringBuilder();
		
		String str;
		while((str = br.readLine()) != null) {
			sb.append(str);
		}
		
		br.close();
		isr.close();
		is.close();
		
		con.disconnect();
		
		JSONObject jObj = new JSONObject(sb.toString());
		JSONObject jObj2 = jObj.getJSONObject("result");
		JSONArray jArray = jObj2.getJSONArray("records");
		for (int i = 0; i < jArray.length(); i++) {
			JSONObject data = jArray.getJSONObject(i);
			System.out.println("站點名稱 = " + data.getString("sna"));
			System.out.println("站點地址 = " + data.getString("ar"));
			System.out.println("現有車輛數 = " + data.getInt("sbi"));
			System.out.println("==================================");
		}
		
	}

}
