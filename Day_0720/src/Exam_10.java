class Student1{
	int bun;
	String name;
	int age;

	Student1(){}
	
	Student1(int bun){
		
	}
	Student1(int bun, String name){
		
	}
	Student1(int bun, String name, int age){
		
	}
	void studentPrint() {
		System.out.println("번호 : " + bun);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
public class Exam_10 {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.bun=1;
		s1.name="AAA";
		s1.age=20;
		s1.studentPrint();

		Student1 s2 = new Student1(5);
		s2.studentPrint();

		Student1 s3 = new Student1(7,"AAAA");
		s3.studentPrint();

	}

}
