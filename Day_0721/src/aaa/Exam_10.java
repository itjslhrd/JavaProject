package aaa;

public class Exam_10 {
	public static void main(String[] args) {
		//키보드 입력
		int hak = 1101;
		String name="홍길동";
		boolean gender=true;
		int age=22;
		int kor=90;
		int eng=80;
		int mat=70;
		
		Student stu1 = new Student();
		stu1.setHak(hak);
		stu1.setName(name);
		stu1.setGender(gender);
		stu1.setAge(age);
		stu1.setKor(kor);
		stu1.setEng(eng);
		stu1.setMat(mat);
		
		// 초기화
		
		Student stu2 = new Student(1102,"이사람",false, 30, 77,88,99);
		
		//출력
		//학번  이름   성별   나이   국어   영어   수학   총점   평균
		//1101 홍     남     22    90    80    70   240    80.00
		System.out.println("학번\t이름\t성별\t나이\t국어\t영어\t수학\t총점\t평균");
		String str="여자";
		if(stu1.isGender())
			str="남자";
		int tot = stu1.getKor()+stu1.getEng()+stu1.getMat();
		double ave = tot / 3.;
		System.out.print(stu1.getHak() + "\t" + stu1.getName() + "\t");		
		System.out.print(stu1.getAge() + "\t" + str + "\t");		
		System.out.print(stu1.getKor() + "\t" + stu1.getEng() + "\t");		
		System.out.print(stu1.getMat() + "\t" + tot + "\t");		
		System.out.print(ave + "\n");
		
		str="여자";
		if(stu2.isGender())
			str="남자";
		tot = stu2.getKor()+stu2.getEng()+stu2.getMat();
		ave = tot / 3.;
		System.out.print(stu2.getHak() + "\t" + stu2.getName() + "\t");		
		System.out.print(stu2.getAge() + "\t" + str + "\t");		
		System.out.print(stu2.getKor() + "\t" + stu2.getEng() + "\t");		
		System.out.print(stu2.getMat() + "\t" + tot + "\t");		
		System.out.print(ave + "\n");

	}

}
