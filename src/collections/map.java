package collections;

import java.util.HashMap;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer>map = new HashMap<String, Integer>();
		
		//dictionary 형태
		map.put("돈까스", 3000);
		map.put("볶음밥",5000);
		map.put("돈까스",6500); //같은 키값은 마지막값으로 갱신
		//map.put(3000,5000);	// 제네릭스가 맞지 않기 때문에 오류	
		System.out.println(map);
		

	}

}
