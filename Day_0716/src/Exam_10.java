
public class Exam_10 {
	//선택정렬 메소드
	static void sort(int[] arr, boolean flag) {
		if(flag) {//오름차순
			System.out.print("Sort ASC : ");
			for(int i=0; i<arr.length-1; i++) {
				for(int j=i+1; j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						int m = arr[i];
						arr[i] = arr[j];
						arr[j] = m;
					}
				}
			}
		}else {//내림차순
			System.out.print("Sort DESC : ");
			for(int i=0; i<arr.length-1; i++) {
				for(int j=i+1; j<arr.length;j++) {
					if(arr[i] < arr[j]) {
						int m = arr[i];
						arr[i] = arr[j];
						arr[j] = m;
					}
				}
			}			
		}
		//출력
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int a[]= {3,6,4,9,6,4,8,6,7};
		sort(a, true);

	}

}
