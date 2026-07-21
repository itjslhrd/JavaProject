//키보드로 학번, 이름, 국어, 영어, 수학 입력
/* 학생객체(Student) 생성후  출력
 */
public class Exam_03 {
	public static void main(String[] args) {
		//키보드 입력(학생 객체 생성)
		int hakbun = 1101;
		String name="김학생";
		int kor=95;
		int eng=90;
		int mat=88;
		
		//기본 생성자 이용시
		Student st1 = new Student();
		st1.hakbun=hakbun;
		
		
		st1.totAve();
		//초기화 생성자 이용시
		Student st2 = new Student(hakbun,name,kor,eng,mat);
		st2.totAve();
			
		//총점, 평균을 구하여 다음과 같이 출력
		//학번   이름  국어   영어   수학   총점   평균
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.print(st1.hakbun + "\t");

		
		System.out.print(st1.ave + "\n");
		
		
		//학점을 구하여 출력(A,B,C,D,F)
		//학번   이름  국어   영어   수학   총점   평균  학점
		String grade = st1.studentGrade();
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.print(st1.hakbun + "\t");

		
		System.out.print(grade + "\n");
		
		
	}

}
