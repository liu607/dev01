package com.fc.entity;

public class Subject {
    private Integer sid;

    private Integer cno;

    private Integer stype;

    private String scontent;

    private String sa;

    private String sb;

    private String sc;

    private String sd;

    private String skey;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public Integer getStype() {
        return stype;
    }

    public void setStype(Integer stype) {
        this.stype = stype;
    }

    public String getScontent() {
        return scontent;
    }

    public void setScontent(String scontent) {
        this.scontent = scontent == null ? null : scontent.trim();
    }

    public String getSa() {
        return sa;
    }

    public void setSa(String sa) {
        this.sa = sa == null ? null : sa.trim();
    }

    public String getSb() {
        return sb;
    }

    public void setSb(String sb) {
        this.sb = sb == null ? null : sb.trim();
    }

    public String getSc() {
        return sc;
    }

    public void setSc(String sc) {
        this.sc = sc == null ? null : sc.trim();
    }

    public String getSd() {
        return sd;
    }

    public void setSd(String sd) {
        this.sd = sd == null ? null : sd.trim();
    }

    public String getSkey() {
        return skey;
    }

    public void setSkey(String skey) {
        this.skey = skey == null ? null : skey.trim();
    }
}