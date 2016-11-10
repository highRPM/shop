package test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import net.sf.json.xml.XMLSerializer;

import org.json.simple.JSONObject;

public class Ttttte {
	//public static int INDENT_FACTOR = 4;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		HttpURLConnection conn =(HttpURLConnection)new URL("http://openapi.tago.go.kr/openapi/service/BusSttnInfoInqireService/getCrdntPrxmtSttnList?ServiceKey=MVghWtkyNtaDuEmTiSo6fx93hrmYkzGaoTZdY7DLl%2Ba7ggACM1Pn3voHJPygvCfHXTzY8kngUr9aU8ldRrDZyA%3D%3D&gpsLati=36.3&gpsLong=127.3").openConnection();
		conn.connect();
		BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
		BufferedReader reader = new BufferedReader(new InputStreamReader(bis));
		StringBuffer st = new StringBuffer();
		String line;
		while((line=reader.readLine())!=null){
			st.append(line);
		}
		net.sf.json.JSONObject json = (net.sf.json.JSONObject)new XMLSerializer().read(st.toString());
		System.out.println(json);
        
	}	
}
