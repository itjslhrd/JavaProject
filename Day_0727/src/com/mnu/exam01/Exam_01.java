package com.mnu.exam01;

public class Exam_01 {
    static int nSize=4;
    public static void makeArray(int[] arr) {
         for(int i=0; i<nSize; i++) {
              arr[i]=i;
         }
    }

	public static void main(String[] args) {
        int[] arr = new int[nSize];
        makeArray(arr);
        for(int i=0; i<nSize; i++) {
             System.out.print(arr[i]+" ");
       }		
	}

}
