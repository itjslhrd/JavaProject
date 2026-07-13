/*    *****
 *    *****
 *    *****
 *    *****
 *    *****
 */
public class Exam_23 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.print(i + " : ");
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

/*
 *      *
 *      **
 *      ***
 *      ****
 *      ***** 		
 */
		for(int i=1; i<=5; i++) {
			System.out.print(i + " : ");
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
/*
 *  *****
 *  ****
 *  ***
 *  **
 *  *		
 */
		for(int i=5; i>=1; i--) {
			System.out.print(i + " : ");
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for(int i=1; i<=5; i++) {
			System.out.print(i + " : ");
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
