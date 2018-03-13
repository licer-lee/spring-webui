package com.liwc.model;

public class SysRole {
    private Integer id;

    private String rCode;

    private String rName;

    private Integer rOrder;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getrCode() {
        return rCode;
    }

    public void setrCode(String rCode) {
        this.rCode = rCode == null ? null : rCode.trim();
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public Integer getrOrder() {
        return rOrder;
    }

    public void setrOrder(Integer rOrder) {
        this.rOrder = rOrder;
    }
}