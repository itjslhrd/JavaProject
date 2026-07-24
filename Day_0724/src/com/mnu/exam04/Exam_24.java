package com.mnu.exam04;

public class Exam_24 {

	public static void main(String[] args) {
        int arr[];
        int i = 0;
        arr = new int[10];
        arr[0] = 0;
        arr[1] = 1;

        while(i<8) {
            arr[i+2] = arr[i+1] + arr[i];
            i++;
        }
        System.out.println(arr[9]);

	}

}
