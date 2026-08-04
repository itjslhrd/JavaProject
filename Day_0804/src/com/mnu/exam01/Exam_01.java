package com.mnu.exam01;

import java.util.ArrayList;
import java.util.List;

//List 인터페이스 :구현 클래스 ArrayList, Vector
//add(), get(), set(), isEmpty(), size(), contains()
public class Exam_01 {
	public static void main(String[] args) {
		List<DeptDTO> dList = new ArrayList();
		
		DeptDTO dto = new DeptDTO();
		dto.setDno(10);
		dto.setDname("AAA");
		dto.setLoc("A001");
		
		dList.add(dto);
		dList.add(new DeptDTO(20, "BBB", "B001"));
		dList.add(new DeptDTO(30, "CCC", "C001"));
		dList.add(new DeptDTO(40, "DDD", "D001"));
		dList.add(new DeptDTO(50, "EEE", "E001"));
		
		//출력
		System.out.println("부서번호\t부서명\t지역명");
		if(!dList.isEmpty()) {//if(dList.size!=0){
		/*	
			for(DeptDTO  var : dList) {
				System.out.print(var.getDno() + "\t");
				System.out.print(var.getDname() + "\t");
				System.out.print(var.getLoc() + "\n");
			}
		*/
		/*	
			for(int x=0; x<dList.size(); x++) {
				DeptDTO d = dList.get(x);
				System.out.print(d.getDno() + "\t");
				System.out.print(d.getDname() + "\t");
				System.out.print(d.getLoc() + "\n");
			}
		*/
			for(int x=0; x<dList.size(); x++) {
				System.out.print(dList.get(x).getDno() + "\t");
				System.out.print(dList.get(x).getDname() + "\t");
				System.out.print(dList.get(x).getLoc() + "\n");
			}
			
		}else {
			System.out.println("등록된 자료가 없습니다.");
		}
		
		
		
	}

}
