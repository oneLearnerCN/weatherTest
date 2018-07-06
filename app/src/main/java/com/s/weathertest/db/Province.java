package com.s.weathertest.db;

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {
    private String provinceName;

    private  int provinceCode;

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }
}
