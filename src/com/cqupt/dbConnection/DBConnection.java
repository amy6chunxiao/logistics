package com.cqupt.dbConnection;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBConnection {
	public static SqlSession getSqlSession() throws IOException {
		String path = "com/cqupt/config/Configuration.xml";
		Reader reader = Resources.getResourceAsReader(path);
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = ssf.openSession();
		return sqlSession;
	}
}
