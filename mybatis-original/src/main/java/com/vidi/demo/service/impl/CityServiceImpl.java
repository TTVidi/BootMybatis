package com.vidi.demo.service.impl;

import com.vidi.demo.model.City;
import com.vidi.demo.mybatis.dao.CityDao;
import com.vidi.demo.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author : Vidi
 * @Date : 2018/4/3 13:52
 * @Descripton :
 */
@Service
public class CityServiceImpl implements CityService {

	@Resource
	private CityDao cityDao;

	@Override
	public List<City> findCityByProvinceId(int provinceId) {
		return cityDao.findCityByProvinceId(provinceId);
	}

	@Override
	public List<City> findAll() {
		return cityDao.findAll();
	}
}
