package com.accp.pojo;

public class user {
    private Integer uid;

    private String upwd;

    private String uidentitycard;

    private String uaddress;

    private String uphone;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }

    public String getUidentitycard() {
        return uidentitycard;
    }

    public void setUidentitycard(String uidentitycard) {
        this.uidentitycard = uidentitycard == null ? null : uidentitycard.trim();
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress == null ? null : uaddress.trim();
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }
}