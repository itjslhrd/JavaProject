package com.mnu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mnu.util.DBManager;

public class MemberDAO {
	//싱글톤 패턴으로 제작
	private MemberDAO() {}
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance() {
		return instance;
	}
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	// 1. 등록 메소드(회원가입)
	public int memberWrite(MemberDTO  mDTO) {
		//반환타입 정의
		int row = 0;
		//쿼리문장정의
		String sql="insert into tbl_member(custno,custname,phone,gender,grade,city)\r\n"
				+ "            values(?,?,?,?,?,?)";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,mDTO.getCustno());
			pstmt.setString(2,mDTO.getCustname());
			pstmt.setString(3,mDTO.getPhone());
			pstmt.setString(4, mDTO.getGender());
			pstmt.setString(5, mDTO.getGrade());
			pstmt.setString(6, mDTO.getCity());
			
			row = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	
	//2. 회원전체 목록 검색 메소드
	public List<MemberDTO> memberList(){
		//반환타입
		List<MemberDTO> mList = new ArrayList();
		//쿼리
		String sql="select custno,custname,phone,gender,grade,cityname,joindate\r\n"
				+ "        from tbl_member m join tbl_city c on m.city=c.city";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				
				dto.setCustno(rs.getInt("custno"));
				dto.setCustname(rs.getString("custname"));
				dto.setPhone(rs.getString("phone"));
				dto.setGender(rs.getString("gender"));
				dto.setGrade(rs.getString("grade"));
				dto.setCityname(rs.getString("cityname"));
				dto.setJoindate(rs.getString("joindate"));
				
				mList.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return mList;
	}
	//회원정보 검색(회원번호)
	public MemberDTO memberSearch(int custno) {
		MemberDTO dto = new MemberDTO();
		String sql="select * from tbl_member where custno=?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custno);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				
				dto.setCustno(rs.getInt("custno"));
				dto.setCustname(rs.getString("custname"));
				dto.setPhone(rs.getString("phone"));
				dto.setGender(rs.getString("gender"));
				dto.setGrade(rs.getString("grade"));
				dto.setJoindate(rs.getString("joindate"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return dto;
	}
}
