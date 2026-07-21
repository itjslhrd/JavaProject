class AA{
	static int a=100;
	int b=200;
	
}

public class Exam_04 {
	public static void main(String[] args) {
		AA.a=1000;
		AA a1 = new AA();
		System.out.println("a=" + a1.a);
		System.out.println("b=" + a1.b);
		
		System.out.println("a=" + AA.a);
		//System.out.println("b=" + AA.b);
		
		AA a2 = new AA();
		a2.a=50000;
		System.out.println("a2.a=" + a2.a);//
		System.out.println("a1.a=" + a1.a);
	}

}
