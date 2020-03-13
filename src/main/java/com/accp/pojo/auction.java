package com.accp.pojo;

import java.util.Date;

public class auction {
    private Integer aid;

    private Integer gid;

    private Integer uid;

    private Integer aprice;

    private Date atime;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getAprice() {
        return aprice;
    }

    public void setAprice(Integer aprice) {
        this.aprice = aprice;
    }

    public Date getAtime() {
        return atime;
    }

    public void setAtime(Date atime) {
        this.atime = atime;
    }
}