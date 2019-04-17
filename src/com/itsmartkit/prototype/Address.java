package com.itsmartkit.prototype;

/**
 * 籍贯
 */
public class Address {
    /**
     * 省
     */
    private String pro;

    /**
     * 市
     */
    private String city;

    /**
     * 邮编
     */
    private String zip;

    public Address() {}

    public Address(String pro, String city, String zip) {
        this.pro = pro;
        this.city = city;
        this.zip = zip;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
