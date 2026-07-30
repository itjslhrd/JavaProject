package com.mnu.exam02;

import java.util.Scanner;

import com.mnu.model.MemberDAO;
import com.mnu.model.MemberDTO;

public class MemberSearch {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("회원번호 입력 :");
		int custno = scn.nextInt();
		
		//회원이 있는 경우(번호, 이름, 전화, 성별, 등급, 등록일 출력)
		//없으면 "등록된 회원정보가 없습니다"
		
		MemberDAO dao = MemberDAO.getInstance();
		
		MemberDTO dto = dao.memberSearch(custno);
		
		System.out.println("회원번호 : " + dto.getCustno());		
		System.out.println("회원번호 : " + dto.getCustno());		
		System.out.println("회원번호 : " + dto.getCustno());		
		System.out.println("회원번호 : " + dto.getCustno());		
		System.out.println("회원번호 : " + dto.getCustno());		
				

	}

}
