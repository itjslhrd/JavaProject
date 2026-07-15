//거품 정렬(Bubble Sort)
import java.util.Arrays;
public class Exam_05 {
	public static void main(String[] args) {
		int[] score = {90,60,80,70,55,88,77,65}; //8
		
		int[] test = score.clone();//복제

		for(int i=0; i<test.length-1; i++) {
			for(int j=0; j<test.length-i-1; j++) {
				if(test[j] > test[j+1]) {
					int imsi = test[j];
					test[j] = test[j+1];
					test[j+1] = imsi;
				}
			}
		}
		System.out.println("정렬 전 :" + Arrays.toString(score));
		System.out.println("정렬 후 :" + Arrays.toString(test));

	}

}
