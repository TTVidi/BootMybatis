package com.vidi.demo.controller;

import com.vidi.demo.model.City;
import com.vidi.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author : Vidi
 * @Date : 2018/4/3 11:36
 * @Descripton :
 */
@RestController
@RequestMapping("/restful")
public class RestFulController {

	@Autowired
	private CityService cityService;

	@RequestMapping("/greeting/{provinceId}")
	public List<City> findCityByProvinceId(@PathVariable int provinceId) {
		return cityService.findCityByProvinceId(provinceId);
	}

	@RequestMapping("/greeting")
	public List<City> findAll() {
		return cityService.findAll();
	}
}
