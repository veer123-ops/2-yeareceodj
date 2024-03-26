package veer.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Frequncnywordcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String  string []= {"veer","veer","raja","raja"};
  
  HashMap<String, Integer> mpHashMap =new HashMap<String, Integer>();
  
  for(String  val : string) {
	  mpHashMap.put(val, mpHashMap.getOrDefault(val, 0)+1);
  }
  for(Entry<String, Integer> entry:mpHashMap.entrySet()) {
	   System.out.println(entry.getValue() +"- " + entry.getKey());
  }
	}


}
