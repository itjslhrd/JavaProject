//데이터 정렬(오름차순, 내림차순)
/* 1. 선택정렬법 : selection sort
 * 2. 거품정렬법 : bubble sort
 * 3. 삽입정렬법 : insertion sort
  */
import java.util.Arrays;

public class Exam_18 {
	public static void main(String[] args) {
		int arr[] = {7,5,9,8,3};
		int brr[] = arr.clone();
		
		for(int i=0; i<brr.length-1; i++) {//기준
			for(int j=i+1; j<brr.length; j++) {
				if(brr[i] > brr[j]) {
					int imsi = brr[i];
					brr[i] = brr[j];
					brr[j] = imsi;
				}
			}
		}
		
		System.out.println("정렬전 : " + Arrays.toString(arr));
		System.out.println("정렬후 : " + Arrays.toString(brr));
		
	}

}
