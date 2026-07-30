package com.mnu.exam01;
import java.io.File;
/* 키보드로 학생정보를 입력 학생객체를 생성 List에 저장후
 * 총점, 평균, 학점을 구하여 출력
 * [입력형식]
 * 학생정보입력 : 1101 이학생 90 80 90
 * 
 *  [출력형식]
 *  번호   이름    국어   영어   수학   총점    평균    학점
 * 
 *  [처리조건]
 *  3명만 입력, 동일한 번호가 있는 경우 "이미등록된 학생입니다' 출력 후 재입력
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Exam_10 {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(new File("src/student.txt"));
		List<Student> sList = new ArrayList<Student>();
		//파일 입력 후 출력 테스트
		while(scn.hasNextLine()) {
			//String data = scn.nextLine();
			//System.out.println(data);
			String data[] = scn.nextLine().split(",");
			Student  stu = new Student();
			stu.setBun(Integer.parseInt(data[0]));
			stu.setName(data[1]);
			stu.setKor(Integer.parseInt(data[2]));
			stu.setEng(Integer.parseInt(data[3]));
			stu.setMat(Integer.parseInt(data[4]));
			//학번중복검사
			boolean bool = false;
			for(int x=0; x<sList.size(); x++) {
				if(stu.getBun()==sList.get(x).getBun()) {
					System.out.println(stu.getBun() +"는 이미 등록된 학번입니다");
					bool = true;//중복
					break;
				}
			}
			if(bool) {
				continue;
			}
			sList.add(stu);

		}
		
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
		for(Student s : sList) {
			System.out.print(s.getBun() + "\t");
			System.out.print(s.getName() + "\t");
			System.out.print(s.getKor() + "\t");
			System.out.print(s.getEng() + "\t");
			System.out.print(s.getMat() + "\t");
			int tot = s.getKor()+s.getEng()+s.getMat();
			System.out.print(tot + "\t");
			System.out.print(tot/3. + "\t");
			String grade="";//학점계산
			System.out.print(grade + "\n");
		}
	}

}
