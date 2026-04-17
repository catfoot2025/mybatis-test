package com.catfoot.mb;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class CarTest {
    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));
            sqlSession = factory.openSession();
            int insertCar = sqlSession.insert("insertCar");
            sqlSession.commit();
            System.out.println("insert " + insertCar);
            System.out.println("test");
        } catch (Exception e) {
            if(sqlSession != null) {
                sqlSession.rollback();
            }
        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
