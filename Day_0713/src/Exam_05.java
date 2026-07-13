
public class Exam_05 {
	public static void main(String[] args) {
		// 1 ~ 10까지 정수 출력
		int s=0;//1+2+3+ . . . + 10
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			s=s+i;//s+=i;
		}
		System.out.println("1 ~ 10 합 : " + s);
		
		//1 ~ 10 홀수 출력 후 홀수 합
		int t=0;// 홀수 합
		for(int j=1; j<=10; j+=2) {
			System.out.println(j);
			t += j;
		}
		System.out.println("1~10 홀수 합 : " + t);
		
		//1 ~ 10 짝수 출력 후 합계
		int tt = 0;//짝수 합계
		for(int i=0; i<=10; i+=2) {
			System.out.println(i);
			tt += i;//tt=tt+i
		}
		System.out.println("1~10 짝수합 : " + tt);
	}

}
