package dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

	
	public static void main(String[] args) {
		
		Map<String,String> dic = new HashMap<String, String>();
		
		dic.put("a", "asshole");
		System.out.println(dic.get("a"));

	}

}
