/*              1
 *           2  3
 *        4  5  6
 *     7  8  9 10
 * 11 12 13 14 15
*/ 
public class Exam_05 {
	public static void main(String[] args) {
		int cnt=0;
		for(int i=1; i<=5; i++) {
			//공백출력
			for(int k=1; k<=6-i; k++) {
				System.out.printf("%3s"," ");
			}
			for(int j=1; j<=i; j++) {
				cnt++;
				System.out.printf("%3d",cnt);
			}
			System.out.print("\n");
		}
	}

}
