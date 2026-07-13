//소수 판별 : 소수는 1과 자신에외의 수로 나누어지지 않는 수
//2 3 5 7 11 
//  4/2 나머지 0 - 자신 , 3/2, 3/3-> 3 3
public class Exam_10 {
	public static void main(String[] args) {
		int a = 25;
		for(int x=2; x<=a; x++) {
			if(a % x == 0) {
				if(x==a) {
					System.out.println(a + "소수입니다");
					break;
				}else {
					System.out.println(a + "소수가아님");
					break;
				}
			}
		}
	}

}
