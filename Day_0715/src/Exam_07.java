//2차원 배열의 선언과 동시 초기화(명시적)
public class Exam_07 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6}};
		
		//출력(기본 for())
		System.out.println("기본 for()");
		for(int i=0; i<arr.length; i++) {//줄(row)
			for(int j=0; j<arr[i].length; j++) {//컨(col)
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.print("\n");
		}
		
		System.out.println("확장 for()");
		for(int[] a : arr) {
			for(int aa : a) {
				System.out.printf("%3d", aa);
			}
			System.out.print("\n");
		}
	}

}
