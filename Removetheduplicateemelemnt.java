package veer.com;

import java.util.HashSet;

public class Removetheduplicateemelemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr [] = {1,2,4,5,6,7,8,9,3,4,1,2,3,5,6,9,2,2,4,5};
     
     HashSet<Integer> mpHashSet = new HashSet<>();
     
     for(int i=0;i<arr.length;i++) {
    	 mpHashSet.add(arr[i]);
     }
     System.out.print(mpHashSet);
     
     }
	}


