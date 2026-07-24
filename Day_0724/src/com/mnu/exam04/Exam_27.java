package com.mnu.exam04;

public class Exam_27 {
	public static void main(String[] args) {
        int[] rank=new int[5];
        int[] arr= {75,32,20,99,55};

        for(int i=0; i<5; i++) {
             rank[i]=1;
             for(int j=0; j<5;j++) {
                 if(arr[i]<arr[j]) {
                     rank[i]++;
                 }
           }
       }
       for(int k=0; k<5;k++) {
            System.out.print(rank[k]);
       }
	}

}
