
public class BB {
	int bun=10;//명시적 초기화
	String name;
	int score;
	
	//자신을 출력하는 메소드
	void bbPrint() {
		int a;//지역변수
		System.out.println("번호 = " + bun);
		System.out.println("이름 = " + name);
		System.out.println("점수 = " + score);
	}
}
