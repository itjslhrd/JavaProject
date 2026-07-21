package bbb;

import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("학생정보입력:");
		int hak = scn.nextInt();
		String name = scn.next();
		boolean gender = scn.nextBoolean();
		int age = scn.nextInt();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		
		//StudentPro stPro = new StudentPro();
		StudentPro stPro = StudentPro.getInstance();
		
		Student st1 = stPro.getStudent(hak,name,gender,age,kor,eng,mat);
		
		stPro.studentOutput(st1);
	}

}
