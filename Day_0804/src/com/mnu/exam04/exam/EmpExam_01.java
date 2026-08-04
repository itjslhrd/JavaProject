package com.mnu.exam04.exam;

import java.util.List;

import com.mnu.exam04.model.CommDTO;
import com.mnu.exam04.model.EmpDAO;

//전체 사원정보 출력
//사원번호, 이름, 입사일, 급여, 부서번호, 부서명, 지역명을 출력
public class EmpExam_01 {
	public static void main(String[] args) {
		EmpDAO dao = EmpDAO.getInstance();
		List<CommDTO> list =  dao.totalList();
		
		System.out.println("사원번호\t이름\t입사일\t급여\t부서번호\t부서명\t지역명");
		for(CommDTO dto : list) {
			
		}
		
	}

}
