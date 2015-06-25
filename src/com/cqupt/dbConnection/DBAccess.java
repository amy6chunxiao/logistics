package com.cqupt.dbConnection;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * mybatis数据库交互类
 * 
 * @author amy
 * 
 */
public class DBAccess {

	/**
	 * 取得一个sqlsession
	 * 
	 * @return {@link SqlSession}
	 * @throws IOException
	 */
	public static SqlSession getSqlSession() throws IOException {

		// Configuration.xml路径，注意不是com.immoc.mybatis.config.Configuration.xml哦
		String path = "com/cqupt/business/config/Configuration.xml";
		// 取得输入流，读取配置文件的数据
		Reader reader = Resources.getResourceAsReader(path);
		// 根据配置文件创建工厂
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
		// 打开一个会话
		SqlSession sqlSession = ssf.openSession();
		return sqlSession;
	}
}
