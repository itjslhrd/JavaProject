package com.mnu.exam03;

public class Exam_19 {

	public static void main(String[] args) {
        int cnt =0;
        do {
            cnt++;//1
        }while(cnt<0);

        if(cnt==1)
            cnt++;
        else
            cnt = cnt + 3;

        System.out.printf("%d", cnt);//2

	}

}
