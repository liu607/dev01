package com.fc.entity;

import java.util.Date;

public class Studentexam {
    private Integer seid;

    private Integer userid;

    private Integer classid;

    private Integer eid;

    private String pname;

    private Integer zscore;

    private Integer score;

    private Date tjtime;

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

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Integer getZscore() {
        return zscore;
    }

    public void setZscore(Integer zscore) {
        this.zscore = zscore;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getTjtime() {
        return tjtime;
    }

    public void setTjtime(Date tjtime) {
        this.tjtime = tjtime;
    }
}