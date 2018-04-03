package com.vidi.demo.mybatis.dao;

import com.vidi.demo.model.City;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author : Vidi
 * @Date : 2018/4/3 13:45
 * @Descripton :
 */
public interface CityDao {
	@Select("SELECT id,provinceId,cityName FROM city WHERE provinceId=#{provinceId}")
	List<City> findCityByProvinceId(int provinceId);

	List<City> findAll();

	@Select("SELECT id,provinceId,cityName FROM city WHERE id=#{id}")
	City findCityById(int id);
}
