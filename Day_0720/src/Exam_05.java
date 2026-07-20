class AA{
	//속성
	int a;//멤버변수(멤버필드)
	int b;
	
	//기능
	void add() {
		System.out.printf("%d + %d = %d\n", a,b,(a+b));
	}
	void sub(int a, int b) {
		System.out.printf("%d + %d = %d\n", a,b,(a+b));
	}
}
public class Exam_05 {
	public static void main(String[] args) {
		AA a1 = new AA();
		a1.a=100;
		a1.b=200;
		a1.add();
		a1.sub(10, 20);
		
	}

}
