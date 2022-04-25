package collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapEx1 {

	public static HashMap<String, Integer> addKeyValue(String key, int value, HashMap<String, Integer> map) {
		boolean check = true;
		Iterator<String> iter = map.keySet().iterator();

		while (iter.hasNext()) {
			String findKey = iter.next();
			if (findKey == key) { // 이미 존재하는 키값이면 빠져나오기
				System.out.println(findKey + " 값은 이미 존재하는 key 값 입니다.");
				check = false;
				break;
			}

		}

		if (check) { // check가 true 일때
			map.put(key, value);
			System.out.print("{" + key + " = " + value + "} 가 삽입되었습니다.");
			System.out.println(" map : " + map);
		}
		return map;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		addKeyValue("first", 1, map);
		addKeyValue("First", 2, map);
		addKeyValue("first", 10, map);
		addKeyValue("Second", 2, map);
		addKeyValue("Third", 3, map);

		System.out.println("최종 map : " + map);

	}

}
