
public class Exam_08 {
	//1 ~ 10 까지 정수 출력하는 메소드
	static void add() {
		int s=0;
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
			s += i;
		}
		System.out.println("=" + s);
	}
	
	//1 ~ N 까지 정수 출력하는 메소드
	static void addN(int n) {
		int s=0;
		for(int i=1; i<=n; i++) {
			System.out.print(i + " ");
			s += i;
		}
		System.out.println("=" + s);
	}

	//1 ~ N 까지 정수합 반환
	static int addSum(int n) {
		int s=0;
		for(int i=1; i<=n; i++) {
			s += i;
		}
		return s;
	}

	public static void main(String[] args) {
		 add();
		 
		 addN(50);
		 addSum(100);//5050
		 
		 System.out.println("1 ~ 20 합 : " + addSum(20));

	}

}
