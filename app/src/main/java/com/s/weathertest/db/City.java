package com.s.weathertest.db;

import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {

    private String cityName;

    private  int cityCode;

    private int provinceID;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }
}
