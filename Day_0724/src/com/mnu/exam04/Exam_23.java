package com.mnu.exam04;

public class Exam_23 {
	public static void main(String[] args) {
	      int arr[]= {7,4,9,7,3,2,8};
	      int s=0;
	      int n= arr.length;
	      for(int i=0; i<n; i++) {
	         if(arr[i]%2 == 0) 
	            continue;
	         s+=arr[i];//7+9+7+3
	      }
	      System.out.print("s="+s);

	}

}
