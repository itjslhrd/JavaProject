//배열 복제
public class Exam_16 {
	public static void main(String[] args) {
		//1. 동일한 크기의 배열을 만든 후 사용
		int arr[] = {10,20,30,40,50};
		int brr[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			brr[i] = arr[i];
		}
		
		System.out.println("arr[0] = " + arr[0]);//10
		System.out.println("brr[0] = " + brr[0]);//10
		
		brr[0] = 200;
		System.out.println("arr[0] = " + arr[0]);//10
		System.out.println("brr[0] = " + brr[0]);//200
		
		
		
		
	}

}
