package collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapEx1 {

	public static HashMap<String, Integer> addKeyValue(String key, int value, HashMap<String, Integer> map) {
		boolean check = true;
		Iterator<String> iter = map.keySet().iterator();

		while (iter.hasNext()) {
			String findKey = iter.next();
			if (findKey == key) { // �̹� �����ϴ� Ű���̸� ����������
				System.out.println(findKey + " ���� �̹� �����ϴ� key �� �Դϴ�.");
				check = false;
				break;
			}

		}

		if (check) { // check�� true �϶�
			map.put(key, value);
			System.out.print("{" + key + " = " + value + "} �� ���ԵǾ����ϴ�.");
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

		System.out.println("���� map : " + map);

	}

}
