package com.mnu.exam02;

import java.util.List;

import com.mnu.model.MemberDAO;
import com.mnu.model.MemberDTO;

//전체 회원정보 출력
public class MemberList {
	public static void main(String[] args) {
		MemberDAO dao = MemberDAO.getInstance();
		
		List<MemberDTO> list = dao.memberList();
		//성별(M:남자/F:여자)
		//등급 :(A:VIP,B:일반,C:직원)
		System.out.println("회원번호\t회원성명\t전화\t\t성별\t등급\t도시명\t가입일자");
		if(!list.isEmpty()) {
			for(MemberDTO dto : list) {
				System.out.print(dto.getCustno() + "\t");
				System.out.print(dto.getCustname() + "\t");
				System.out.print(dto.getPhone() + "\t");
				System.out.print(dto.getGender() + "\t");
				System.out.print(dto.getGrade() + "\t");
				System.out.print(dto.getCityname() + "\t");
				System.out.print(dto.getJoindate() + "\n");
			}
		}else {
			System.out.println("등록된 회원이 없음");
		}
	}

}
