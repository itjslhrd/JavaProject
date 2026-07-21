package bbb;

public class StudentPro {
	private StudentPro() {}
	
	public static StudentPro pro = new StudentPro();
	
	public static StudentPro getInstance() {
		return pro;
	}
	
	//필요한 메소드 정의
	//1. Student 객체를 생성 후 반환하는 메소드
	public Student getStudent(int hak,String name, boolean gender,
			int age,int kor,int eng,int mat) {
		
		Student student = new Student(hak,name, gender,age,kor,eng,mat);
		
		return student;
	}
	
	//2. 총점, 평균, 출력 하는 메소드
	public void studentOutput(Student st1) {
		System.out.println("학번\t이름\t성별\t나이\t국어\t영어\t수학\t총점\t평균");
		String str="여자";
		if(st1.isGender())
			str="남자";
		int tot = st1.getKor()+st1.getEng()+st1.getMat();
		double ave = tot / 3.;
		System.out.print(st1.getHak() + "\t" + st1.getName() + "\t");		
		System.out.print(st1.getAge() + "\t" + str + "\t");		
		System.out.print(st1.getKor() + "\t" + st1.getEng() + "\t");		
		System.out.print(st1.getMat() + "\t" + tot + "\t");		
		System.out.print(ave + "\n");

	}
}
