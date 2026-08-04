package com.mnu.exam04.exam;

import java.sql.Connection;

import com.mnu.exam04.util.DBManager;

public class DbConn {
	public static void main(String[] args) {
		Connection conn = DBManager.getConnection();
		
		System.out.println("Connnnnnnn : " + conn);
	}

}
