package com.mnu.exam04;
/*
 * 배열에는 95, 75, 85, 100, 50 이 차례대로 저장된다.
    배열에 저장된 값을 오름차순으로 정렬하여 출력한다.
 */
public class Exam_25 {
	public static void main(String[] args) {
        int E[ ] = { 95, 75, 85, 100, 50 };
        int i = 0;  int Temp = 0;
        do {
            int j = i;
            do {
                if( E[i] > E[j] ) {
                    Temp = E[i];
                    E[i] = E[j];
                    E[j] = Temp;
                }
                j++;
            } while ( j < 5 );
            i++;
        } while ( i < 4 );
        for ( int a = 0; a < 5; a++ ) {
            System.out.printf(E[a]+"\t");
        }
        System.out.println();
	}
}
