package com.vidi.demo.service;

import com.vidi.demo.model.City;

import java.util.List;

/**
 * @Author : Vidi
 * @Date : 2018/4/3 13:51
 * @Descripton :
 */
public interface CityService {
	List<City> findCityByProvinceId(int provinceId);

	List<City> findAll();
}
