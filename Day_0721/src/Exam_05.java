class SS{
	int a=10;
}

//싱글톤 클래스 만들기
class Sin {
	//private외부에서 접근 불가
	private Sin() {}
	
	static Sin s = new Sin();//자신 스스로 객체를 생성
	
	static Sin getSin() {
		return s;
	}
}

public class Exam_05 {
	public static void main(String[] args) {
		SS s1 = new SS();//객체(인스턴스) 생성
		SS s2 = new SS();
		SS s3 = new SS();
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		//Sin s = new Sin();
		
		Sin sin1 = Sin.getSin();
		Sin sin2 = Sin.getSin();
		
		System.out.println("sin1 = " + sin1);
		System.out.println("sin2 = " + sin2);

	}

}
