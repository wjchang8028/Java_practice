package collections;

import java.util.HashMap;
import java.util.Iterator;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer>map = new HashMap<String, Integer>();
		
		//dictionary ����
		map.put("���", 3000);
		map.put("������",5000);
		map.put("���",6500); //���� Ű���� ������������ ����
		//map.put(3000,5000);	// ���׸����� ���� �ʱ� ������ ����	
		map.put("���ܺ����",8000);
		
		System.out.println(map);
		//{������=5000, ���=6500, ���ܺ����=8000}
		
		Iterator<String> keys = map.keySet().iterator();
		
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println(key+" "+map.get(key));
		}
//		������ 5000
//		��� 6500
//		���ܺ���� 8000

		

	}

}
