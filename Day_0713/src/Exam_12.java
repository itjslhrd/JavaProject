//1 ~ 10
public class Exam_12 {
	public static void main(String[] args) {
		//1 ~ 10 정수 출력 후 합계
		// 1 2 3 4     10 = 55
		//1. for()
		int sum=0;//합계
		for(int i=1; i<=10; i++) {
			System.out.printf("%3d", i);
			sum += i;
		}
		System.out.printf(" = %3d\n", sum);
		
		//while()
		int i=0;
		int tot=0;//합계
		while(i<10) {
			i++;
			System.out.printf("%3d", i);
			tot += i;
		}
		System.out.printf(" = %3d\n", tot);

		//while()
		int j=1;
		int t=0;//합계
		while(j<=10) {
			System.out.printf("%3d", j);
			t += j;
			j++;
		}
		System.out.printf(" = %3d\n", t);
	
	}

}
