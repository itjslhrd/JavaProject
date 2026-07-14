//배열 선언과 동시에 원하는 값으로 초기화
import java.util.Arrays;

public class Exam_08 {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,2,3,4,56,6,54,344,4,5,56,6};
		int arr2[] = new int[] {10,20,30,40,50};
		int arr3[] = new int[5];//자동초기화 (0)
		
		//배열 요소수 
		int cnt = arr.length;//16
		System.out.println("arr 배열 요소수 : " + cnt);
		System.out.println("arr 배열 요소수 : " + arr.length);
		//배열요소 확인(출력) Arrays.toString(arr)

		System.out.println(Arrays.toString(arr));
		arr[1] = 100;
		System.out.println(Arrays.toString(arr));
		
		//배열 요소 합계
		//int sum = arr[0]+arr[1]+ +arr[15];
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("arr 배열요소 합 : " + sum);
	}

}
