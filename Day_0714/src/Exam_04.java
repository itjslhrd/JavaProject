/*     *********
 *      *******
 *       *****
 *        ***
 *         *
 * 
 */
public class Exam_04 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			//공백추가
			for(int k=1; k<i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(6-i)*2-1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");//줄바꿈
		}
		System.out.println("------------------");
		for(int i=5; i>=1; i--) {
			//공백추가
			for(int k=1; k<(6-i); k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
