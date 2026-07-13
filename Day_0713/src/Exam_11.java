//소수 판별 : 소수는 1과 자신에외의 수로 나누어지지 않는 수
//2 3 5 7 11 
//  4/2 나머지 0 - 자신 , 3/2, 3/3-> 3 3
public class Exam_11 {
	public static void main(String[] args) {
		int a = 25;
		int x;
		for(x=2; x<=a; x++) {
			if(a % x == 0) {
				break;
			}
		}
		if(x==a) {
			System.out.println(a+"는 소수");
		}else {
			System.out.println(a+"는 소수아님");
		}
		
	}

}
