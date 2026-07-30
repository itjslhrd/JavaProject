package com.mnu.exam02;

import java.sql.Connection;

import com.mnu.util.DBManager;

public class DbTest {
	public static void main(String[] args) {
		Connection conn = DBManager.getConnection();
		System.out.print("conn : " + conn);
	}

}
