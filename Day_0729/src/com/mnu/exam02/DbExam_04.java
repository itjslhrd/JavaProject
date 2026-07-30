package com.mnu.exam02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mnu.util.DBManager;

public class DbExam_04 {
	public static void main(String[] args) {
		//키보드로 부서번호 입력
		int dno = 60;
		
		
		Connection conn  = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql="DELETE FROM DEPT WHERE DNO=?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dno);
			
			int row = pstmt.executeUpdate();//insert, update, delete
			System.out.println("삭제된 로우 : " + row);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}

}
