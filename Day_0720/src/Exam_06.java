
public class Exam_06 {
	BB b = new BB();//멤버
	public static void main(String[] args) {
		BB b2 = new BB();//객체 생성 또는 인스턴스
		b2.bun=100;
		b2.name="김학생";
		b2.score=95;
		b2.bbPrint();
	
		if(b2.score>=90)
			System.out.println("합격");
	}

}
