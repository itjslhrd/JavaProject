package com.mnu.exam04.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mnu.exam04.util.DBManager;

public class EmpDAO {
	private EmpDAO () {}
	
	public static EmpDAO instance = new EmpDAO();
	public static EmpDAO getInstance() {
		return instance;
	}
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	//
	public List<CommDTO> totalList(){
		//반환타입
		List<CommDTO> list = new ArrayList<CommDTO>();
		//쿼리
		String sql="select eno,ename,hiredate,salary,e.dno,dname,loc \r\n"
				+ "        from emp e join dept d on e.dno=d.dno";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				CommDTO dto = new CommDTO();
				dto.empDTO.setEno(rs.getInt("eno"));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
	
	public List<EmpDTO> nameList(String name){
		//반환타입
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		//쿼리
		String sql="select * from emp where ename like ? ";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"%" + name + "%");
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				
				
				list.add(dto);
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
	
	
}
