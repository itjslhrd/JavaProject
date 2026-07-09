//++, --
public class Exam_05 {
	public static void main(String[] args) {
		int a=5, b=0;
		
		b = a++ + a++ + a++;
		//= 5   + 6   + 7  --> ++ (8)
		System.out.printf("a=%d  b=%d \n", a, b);
		
		a=5;
		b=++a + ++a + ++a;
		//= 6  + 7 + 8
		System.out.printf("a=%d  b=%d \n", a, b);
		
		int k=5;
		int x = k++ + 5;
		System.out.printf("k=%d  x=%d \n", k, x);
	}

}
