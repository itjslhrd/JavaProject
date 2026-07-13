/*   1  2  3  4  5 15
 *   6  7  8  9 10 40
 *  11 12 13 14 15 65
 *  16 17 18 19 20 xx
 *  21 22 23 24 25 xx 
 */
public class Exam_28 {

	public static void main(String[] args) {
		
		int cnt=0;
		int sum = 0;
		for(int i=1; i<=5; i++) {
			sum = 0;
			for(int j=1; j<=5; j++) {
				cnt++;
				sum += cnt;
				System.out.printf("%5d",cnt);
			}
			System.out.printf("%5d", sum);
			System.out.print("\n");
			//sum=0;
		}
	}
}
