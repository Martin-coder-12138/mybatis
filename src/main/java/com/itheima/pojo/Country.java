package com.itheima.pojo;

/**
 * Created with IntelliJ IDEA.
 *
 * @version V1.0
 * @author: ZhangZheng
 * @Date: 2019/7/24
 * @Time: 9:23
 * @description
 */
public class Country {
    private Integer id;
    private String countryname;
    private String countrycode;

    public Country() {
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Country{");
        sb.append("id=").append(id);
        sb.append(", countryname='").append(countryname).append('\'');
        sb.append(", countrycode='").append(countrycode).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}
