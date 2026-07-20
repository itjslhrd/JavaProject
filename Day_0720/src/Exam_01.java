
public class Exam_01 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int cnt=0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				cnt++;
				arr[i][j]=cnt;
				arr[i][4] += cnt;
				arr[4][j] += cnt;
				arr[4][4] += cnt;
			}
		}
		
		//출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.print("\n");
		}
		
	}

}
