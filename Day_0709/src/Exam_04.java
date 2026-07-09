//연산자(++, --)
public class Exam_04 {
	public static void main(String[] args) {
		int a=5;
		int b=0;
		
		a++;//후위형(5+1) 6
		++a;//전위형(6+1) 7
		System.out.println("a=" + a);//7
		
		a = 5;
		b = a++;//대입후 연산 b=5, a++(6)
		System.out.printf("a=%d   b=%d\n", a,b);
		
		a=5;
		b=++a; // 연산 후 대입(++a(6), b=6
		System.out.printf("a=%d   b=%d\n", a,b);

	}

}
