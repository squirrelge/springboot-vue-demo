package com.roypan.platohome.model;

import java.time.LocalDate;
import java.util.Date;

public class QuotationDo {
    private Integer id;

    private String name;

    private Integer sex;

    private LocalDate date;

    private String country;

    private String quotation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getQuotation() {
        return quotation;
    }

    public void setQuotation(String quotation) {
        this.quotation = quotation;
    }


    @Override
    public String toString() {
        return "QuotationDo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", date=" + date +
                ", country='" + country + '\'' +
                ", quotation='" + quotation + '\'' +
                '}';
    }
}