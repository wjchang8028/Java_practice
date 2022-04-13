package collections;

import java.util.HashMap;
import java.util.Iterator;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer>map = new HashMap<String, Integer>();
		
		//dictionary ÇüÅÂ
		map.put("µ·±î½º", 3000);
		map.put("ººÀ½¹ä",5000);
		map.put("µ·±î½º",6500); //°°Àº Å°°ªÀº ¸¶Áö¸·°ªÀ¸·Î °»½Å
		//map.put(3000,5000);	// Á¦³×¸¯½º°¡ ¸ÂÁö ¾Ê±â ¶§¹®¿¡ ¿À·ù	
		map.put("µ¹¼Üºñºö¹ä",8000);
		
		System.out.println(map);
		//{ººÀ½¹ä=5000, µ·±î½º=6500, µ¹¼Üºñºö¹ä=8000}
		
		Iterator<String> keys = map.keySet().iterator();
		
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println(key+" "+map.get(key));
		}
//		ººÀ½¹ä 5000
//		µ·±î½º 6500
//		µ¹¼Üºñºö¹ä 8000

		

	}

}
