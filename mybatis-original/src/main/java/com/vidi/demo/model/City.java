package com.vidi.demo.model;

import java.io.Serializable;

/**
 * @Author : Vidi
 * @Date : 2018/4/3 11:41
 * @Descripton :
 */
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private int provinceId;

	private String cityName;

	public City() {
	}

	public City(int id, int provinceId, String cityName) {
		this.id = id;
		this.provinceId = provinceId;
		this.cityName = cityName;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "City{" +
				"id=" + id +
				", provinceId=" + provinceId +
				", cityName='" + cityName + '\'' +
				'}';
	}
}
