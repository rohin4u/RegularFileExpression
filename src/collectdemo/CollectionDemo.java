package collectdemo;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		
		
		List list = new ArrayList();
		
		list.add("delhi");
		list.add(10);
		list.add(10.89);
		list.add(23L);
		
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		

	}

}
