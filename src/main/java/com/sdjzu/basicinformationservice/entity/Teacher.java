package com.sdjzu.basicinformationservice.entity;

public class Teacher {
    private String tno;

    private String tname;

    private String tbirthday;

    private String tsex;

    private String tid;

    private String tpstatus;

    private String tdept;

    private String tpost;

    private String tstudy;

    private String temail;

    private String tphone;

    private String tremark;

    private String tstart;

    private String tctime;

    private String tdegree;

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTbirthday() {
        return tbirthday;
    }

    public void setTbirthday(String tbirthday) {
        this.tbirthday = tbirthday;
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTpstatus() {
        return tpstatus;
    }

    public void setTpstatus(String tpstatus) {
        this.tpstatus = tpstatus;
    }

    public String getTdept() {
        return tdept;
    }

    public void setTdept(String tdept) {
        this.tdept = tdept;
    }

    public String getTpost() {
        return tpost;
    }

    public void setTpost(String tpost) {
        this.tpost = tpost;
    }

    public String getTstudy() {
        return tstudy;
    }

    public void setTstudy(String tstudy) {
        this.tstudy = tstudy;
    }

    public String getTemail() {
        return temail;
    }

    public void setTemail(String temail) {
        this.temail = temail;
    }

    public String getTphone() {
        return tphone;
    }

    public void setTphone(String tphone) {
        this.tphone = tphone;
    }

    public String getTremark() {
        return tremark;
    }

    public void setTremark(String tremark) {
        this.tremark = tremark;
    }

    public String getTstart() {
        return tstart;
    }

    public void setTstart(String tstart) {
        this.tstart = tstart;
    }

    public String getTctime() {
        return tctime;
    }

    public void setTctime(String tctime) {
        this.tctime = tctime;
    }

    public String getTdegree() {
        return tdegree;
    }

    public void setTdegree(String tdegree) {
        this.tdegree = tdegree;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tno='" + tno + '\'' +
                ", tname='" + tname + '\'' +
                ", tbirthday='" + tbirthday + '\'' +
                ", tsex='" + tsex + '\'' +
                ", tid='" + tid + '\'' +
                ", tpstatus='" + tpstatus + '\'' +
                ", tdept='" + tdept + '\'' +
                ", tpost='" + tpost + '\'' +
                ", tstudy='" + tstudy + '\'' +
                ", temail='" + temail + '\'' +
                ", tphone='" + tphone + '\'' +
                ", tremark='" + tremark + '\'' +
                ", tstart='" + tstart + '\'' +
                ", tctime='" + tctime + '\'' +
                ", tdegree='" + tdegree + '\'' +
                '}';
    }
}