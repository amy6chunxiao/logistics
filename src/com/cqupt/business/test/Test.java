package com.cqupt.business.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.cqupt.dbConnection.DBConnection;

public class Test {
	public static void main(String[] args) {
		SqlSession sqlSession = null;
		try {
			sqlSession = DBConnection.getSqlSession();
			if (sqlSession != null) {
				System.out.println("1");
			} else {
				System.out.println("2");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
}
