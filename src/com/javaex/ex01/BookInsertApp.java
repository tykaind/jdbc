package com.javaex.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookInsertApp {

	public static void main(String[] args) {
		// 0. import java.sql.*;
				Connection conn = null;
				PreparedStatement pstmt = null;

				try {
				    // 1. JDBC 드라이버 (Oracle) 로딩
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
				    // 2. Connection 얻어오기
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					conn = DriverManager.getConnection(url, "webdb", "webdb");
					
				    // 3. SQL문 준비 / 바인딩 / 실행
					String query = ""; //쿼리문 문자열로 만들기 --> ? 주의
					query += "insert into book";
					query +=" values (seq_book_id.nextval, ?, ?, ?, ?)";
					
					pstmt = conn.prepareStatement(query);	//쿼리문으로 만들기
					pstmt.setString(1, "박수현"); 		 	// ?(물음표) 중 1번째 --순서중요
					pstmt.setString(2, "내가최고");			// ?(물음표) 중 2번째 --순서중요
					pstmt.setString(3, "98/12/12");			// ?(물음표) 중 3번째 --순서중요
					pstmt.setInt(4, 4);						// ?(물음표) 중 4번째 --순서중요
					
					int count = pstmt.executeUpdate(); //쿼리문 실행 --> 리턴값으로 성공여부 판단
					
					// 4.결과처리
					System.out.println(count + "건이 저장되었습니다.");
					
				} catch (ClassNotFoundException e) {
				    System.out.println("error: 드라이버 로딩 실패 - " + e);
				} catch (SQLException e) {
				    System.out.println("error:" + e);
				} finally {
				   
				    // 5. 자원정리
				    try {            
				        if (pstmt != null) {
				            pstmt.close();
				        }
				        if (conn != null) {
				            conn.close();
				        }
				    } catch (SQLException e) {
				        System.out.println("error:" + e);
				    }

				}

				


	}

}
