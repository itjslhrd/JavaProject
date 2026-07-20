
public class Student {
	//속성(변수)
	int gubun;//초(1), 중(2), 고(3), 대(4)
	String name;
	boolean max;//성별(true:남/false(여)
	
	//기능
	//자신소개 기능
	void studentPr() {
		System.out.println("저는 " + gubun + "이고 ");
		System.out.println("이름은" + name + "입니다 ");
	}
}
