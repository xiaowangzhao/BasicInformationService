package com.sdjzu.basicinformationservice.entity;

public class User {
    private String userid;

    private String username;

    private String password;

    private String usermailaddress;

    private String userpin;

    private Integer count;

    private Boolean isenabled;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsermailaddress() {
        return usermailaddress;
    }

    public void setUsermailaddress(String usermailaddress) {
        this.usermailaddress = usermailaddress;
    }

    public String getUserpin() {
        return userpin;
    }

    public void setUserpin(String userpin) {
        this.userpin = userpin;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Boolean getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(Boolean isenabled) {
        this.isenabled = isenabled;
    }
}