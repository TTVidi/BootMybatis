package com.vidi.demo.test;

import com.vidi.demo.model.City;
import com.vidi.demo.mybatis.dao.CityDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author : Vidi
 * @Date : 2018/4/3 14:04
 * @Descripton :
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {
	@Autowired
	private CityDao cityDao;

	@Autowired
	SqlSessionFactory sqlSessionFactory;

	Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	public void findAllTest() {
		List<City> all = cityDao.findAll();
		for (City city : all) {
			System.out.println(city);
		}
	}

	@Test
	public void sessionTest() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		City city = sqlSession.selectOne("com.vidi.demo.mybatis.dao.CityDao.findCityById", 1);
		City city2 = sqlSession.selectOne("com.vidi.demo.mybatis.dao.CityDao.findCityById", 2);
		City city3 = sqlSession.selectOne("com.vidi.demo.mybatis.dao.CityDao.findCityById", 1);
		sqlSession.close();
	}

}
