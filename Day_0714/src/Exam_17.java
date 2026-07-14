//배열복제
public class Exam_17 {

	public static void main(String[] args) {
		//2. 배열이름.clone() 메소드 이용
		int arr[] = {10,20,30,40,50};
		int brr[] = arr.clone();
		
		System.out.println("arr[0] = " + arr[0]);//10
		System.out.println("brr[0] = " + brr[0]);//10
		
		brr[0] = 200;
		System.out.println("arr[0] = " + arr[0]);//10
		System.out.println("brr[0] = " + brr[0]);//200

		
	}

}
