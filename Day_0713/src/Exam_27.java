
public class Exam_27 {
	public static void main(String[] args) {
		int cnt=0;
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				cnt++;
				System.out.printf("%3d",cnt);
			}
			System.out.print("\n");
			
		}
		
		cnt=0;
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				cnt++;
				System.out.printf("%3d",cnt);
			}
			System.out.print("\n");
			
		}
		
	}

}
