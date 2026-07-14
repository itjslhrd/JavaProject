// 배열  [] - 1차원 배열, [][] - 2차원배열
public class Exam_06 {
	public static void main(String[] args) {
		//배열 선언
		int arr[]; // int[] arr;
		
		//공간 할당
		arr = new int[5];//자동초기화
		System.out.println("arr : " + arr);//참조값(주소)
		System.out.println("arr[0] : " + arr[0]);//값(0)
		System.out.println("arr[1] : " + arr[1]);
		//System.out.println("arr[5] : " + arr[5]);
		//arr=10;//불가
		arr[0] = 100;
		
		
		//배열의 선과과 메모리 할당
		int var[] = new int[5];
		
		
	}

}
