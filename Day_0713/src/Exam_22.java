//행열
public class Exam_22 {
	public static void main(String[] args) {
		//5 * 5 행열
		for(int i=1; i<=5; i++) {//줄(row) i=1
			System.out.print(i +":" );
			for(int j=1; j<=5; j++) {//칸(col)j 1 2 3 4 5 6
				System.out.print("*"+j);
			}
			System.out.print("\n");
		}
		
		System.out.println("-----------------------");
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
