package Rahul;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Example1 {

	/**
	 * @param args
	 */
	public static int invert(int a){
		String temp = String.valueOf(a);
		if(temp.matches("[2-9]")){
			System.out.println("Hi...");
			return a;
		}
		else if(temp.matches("[0-9][0-9]+")){
			System.out.println("Hi...Rahul");
			return a;
		}
		else{
			return Math.abs(a-1);	
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(3);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);*/

		
		
		A x = new A(3);
		A y =new A(4);
		A z = new A(3);
		
		System.out.println(x.hashCode());
		
		Map<A,String> hashtable = new HashMap<A,String>();
		hashtable.put(null, "Rahul");
		System.out.println(hashtable.put(null, "vikky"));
		
		//shashtable.put("1", "Vikky");
		System.out.println("Size = " + hashtable.size() );
		System.out.println(hashtable);
		System.out.println(hashtable.get(null));
		
		
		}

}
