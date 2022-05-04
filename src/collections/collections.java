package collections;

import java.util.ArrayList;
import java.util.Collections;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(30);
		System.out.println();
		
		System.out.println(list);
		
		Collections.sort(list); //collections.sort() 정렬
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder()); // 역정렬
		System.out.println(list);

	}

}
