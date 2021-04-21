package com.callor.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.callor.db.service.DBContract;

public class OracleEx_01 {
	
	public static void main(String[] args) {
		
		System.out.println("Hello 오라클");
		System.out.println("JdbcDriver" + DBContract.DB_INFO.jdbcDriver);
		System.out.println("URL" + DBContract.DB_INFO.URL );
		System.out.println("USER" + DBContract.DB_INFO.USER);
		System.out.println("PASSWORD" + DBContract.DB_INFO.PASSWORD);
	
		// JdbcDriver 실행
		Connection dbConn = null;
		try {
			Class.forName(DBContract.DB_INFO.jdbcDriver);
			
			// JDBC Driver를 통하여 Oracle Server에 접속해 달라
			// 접속이 성공하면 그 정보를 dbConn에 담아달라
			dbConn = DriverManager.getConnection(
					DBContract.DB_INFO.URL,
					DBContract.DB_INFO.USER,
					DBContract.DB_INFO.PASSWORD
					);
			System.out.println("Oracle 연결 성공!!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Jdbc Driver 없음!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 연결 완료!!
		PreparedStatement pStr = null;
		
		String sql = "SELECT * FROM tbl_iolist";
		try {
			pStr = dbConn.prepareStatement(sql);
			ResultSet result = pStr.executeQuery();
			
			while(result.next()) {
				System.out.println(result.getString(2));
			}
			result.close();
			dbConn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
