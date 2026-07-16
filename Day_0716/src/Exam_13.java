
public class Exam_13 {
	static int[] test(int a) {
		int arr[] = new int[a];
		for(int i=0; i<arr.length; i++) {
			arr[i] =  i+10;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int a[] = test(5);
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i] + " ");
		}

	}

}
