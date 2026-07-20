class Person2{
	String name;//이름
	int age;//나이
	String gender;//성별(1-남자, 2-여자)
	
	Person2(String name, int age, String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	void personPrint() {
		String man="여성";
		if(gender.equals("1"))
			man = "남성";
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + man);
	}
}
// 출력
/*  이름 : 이사람
	나이 : 28
	성별 : 남성
*/

public class Exam_13 {
	public static void main(String[] args) {
		Person2 p1 = new Person2("이사람",28,"1");
		
		p1.personPrint();
		
	}

}
