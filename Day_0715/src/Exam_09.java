
public class Exam_09 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];

		//출력 - 1
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.print("\n");
		}
		
		int cnt=0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				cnt++;
				arr[i][j] = cnt;
			}
		}
		
		//출력 - 2
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.print("\n");//줄바꿈
		}
		
		
	}

}
