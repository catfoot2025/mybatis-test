package com.catfoot.mb;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;


public class TestCar {
    @Test
    public void testInsert() {
        SqlSession sqlSession = null;
        try {
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
            sqlSession = factory.openSession();
            int insertCar = sqlSession.insert("insertCar");
            sqlSession.commit();
            System.out.println("insert " + insertCar);
            Assert.assertEquals(1, insertCar);
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
