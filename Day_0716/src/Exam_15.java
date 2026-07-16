//재귀(Recursion) 함수 : 자기가 자신을 호출
public class Exam_15 {
	static void test(int n) {
		if(n==0)
			return;
		System.out.println("Hello World!");
		test(n-1);
	}
	
	public static void main(String[] args) {
		
		test(5);
	}

}
