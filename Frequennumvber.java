package veer.com;

import java.util.HashMap;
import java.util.Map.Entry;

public class Frequennumvber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			// TODO Auto-generated method stub
	  int  arr []= {1,2,4,5,9,3,4,5,6,5,8,9};
	  
	  HashMap<Integer, Integer> mpHashMap =new HashMap<Integer, Integer>();
	  
	  for(int  val : arr) {
		  mpHashMap.put(val, mpHashMap.getOrDefault(val, 0)+1);
	  }
	  for(Entry<Integer, Integer> entry:mpHashMap.entrySet()) {
		   System.out.println(entry.getValue() +"===" + entry.getKey());
	  }
	

	}

}
