package com.accp.pojo;

import java.util.Date;

public class goods {
    private Integer gid;

    private Integer uid;

    private String gname;

    private Date gstart;

    private Date gfinish;

    private Integer gstartingprice;

    private Integer gtransactionprice;

    private String gnotice;

    private String gpicture;

    private Integer gstate;

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

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public Date getGstart() {
        return gstart;
    }

    public void setGstart(Date gstart) {
        this.gstart = gstart;
    }

    public Date getGfinish() {
        return gfinish;
    }

    public void setGfinish(Date gfinish) {
        this.gfinish = gfinish;
    }

    public Integer getGstartingprice() {
        return gstartingprice;
    }

    public void setGstartingprice(Integer gstartingprice) {
        this.gstartingprice = gstartingprice;
    }

    public Integer getGtransactionprice() {
        return gtransactionprice;
    }

    public void setGtransactionprice(Integer gtransactionprice) {
        this.gtransactionprice = gtransactionprice;
    }

    public String getGnotice() {
        return gnotice;
    }

    public void setGnotice(String gnotice) {
        this.gnotice = gnotice == null ? null : gnotice.trim();
    }

    public String getGpicture() {
        return gpicture;
    }

    public void setGpicture(String gpicture) {
        this.gpicture = gpicture == null ? null : gpicture.trim();
    }

    public Integer getGstate() {
        return gstate;
    }

    public void setGstate(Integer gstate) {
        this.gstate = gstate;
    }
}