package com.sdjzu.basicinformationservice.entity;

public class Speciality {
    private String specid;

    private String specname;

    private String tno;

    public String getSpecid() {
        return specid;
    }

    public void setSpecid(String specid) {
        this.specid = specid;
    }

    public String getSpecname() {
        return specname;
    }

    public void setSpecname(String specname) {
        this.specname = specname;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    @Override
    public String toString() {
        return "Speciality{" +
                "specid='" + specid + '\'' +
                ", specname='" + specname + '\'' +
                ", tno='" + tno + '\'' +
                '}';
    }
}