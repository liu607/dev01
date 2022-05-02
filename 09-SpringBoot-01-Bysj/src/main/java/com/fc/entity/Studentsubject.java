package com.fc.entity;

public class Studentsubject {
    private Integer ssid;

    private Integer seid;

    private Integer userid;

    private Integer eid;

    private Integer sid;

    private String studentkey;

    public Integer getSsid() {
        return ssid;
    }

    public void setSsid(Integer ssid) {
        this.ssid = ssid;
    }

    public Integer getSeid() {
        return seid;
    }

    public void setSeid(Integer seid) {
        this.seid = seid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getStudentkey() {
        return studentkey;
    }

    public void setStudentkey(String studentkey) {
        this.studentkey = studentkey == null ? null : studentkey.trim();
    }
}