//생성자 : 객체 생성시 호출되는 메소드
//클래스 이름과 동일 한 메소드
class EE{
	int a;
	String n;
	
	void test() {
		
	}
}
public class Exam_09 {
	public static void main(String[] args) {
		EE e1 = new EE();
		e1.a=1;
		e1.n="AAA";
		
		EE e2 = new EE();
		e2.a=3;
		e2.n="ssss";
		
		
		e1.test();
	}

}
