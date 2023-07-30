package com.ruanko.hlearning.login.entity;

import java.util.Date;

public class Course {

    private int cs_id;
    private String cs_name;
    private int cs_tcid;
    private String cs_type;
    private String cs_url;
    private int cs_likecount;
    private int cs_state;
    private Date createtime;
    private Date updatetime;
    private String creator;
    private String updator;

    public Course() {
    }

    public Course(int cs_id, String cs_name, int cs_tcid, String cs_type, String cs_url, int cs_likecount, int cs_state, Date createtime, Date updatetime, String creator, String updator) {
        this.cs_id = cs_id;
        this.cs_name = cs_name;
        this.cs_tcid = cs_tcid;
        this.cs_type = cs_type;
        this.cs_url = cs_url;
        this.cs_likecount = cs_likecount;
        this.cs_state = cs_state;
        this.createtime = createtime;
        this.updatetime = updatetime;
        this.creator = creator;
        this.updator = updator;
    }

    public int getCs_id() {
        return cs_id;
    }

    public void setCs_id(int cs_id) {
        this.cs_id = cs_id;
    }

    public String getCs_name() {
        return cs_name;
    }

    public void setCs_name(String cs_name) {
        this.cs_name = cs_name;
    }

    public int getCs_tcid() {
        return cs_tcid;
    }

    public void setCs_tcid(int cs_tcid) {
        this.cs_tcid = cs_tcid;
    }

    public String getCs_type() {
        return cs_type;
    }

    public void setCs_type(String cs_type) {
        this.cs_type = cs_type;
    }

    public String getCs_url() {
        return cs_url;
    }

    public void setCs_url(String cs_url) {
        this.cs_url = cs_url;
    }

    public int getCs_likecount() {
        return cs_likecount;
    }

    public void setCs_likecount(int cs_likecount) {
        this.cs_likecount = cs_likecount;
    }

    public int getCs_state() {
        return cs_state;
    }

    public void setCs_state(int cs_state) {
        this.cs_state = cs_state;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cs_id=" + cs_id +
                ", cs_name='" + cs_name + '\'' +
                ", cs_tcid=" + cs_tcid +
                ", cs_type='" + cs_type + '\'' +
                ", cs_url='" + cs_url + '\'' +
                ", cs_likecount=" + cs_likecount +
                ", cs_state=" + cs_state +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", creator='" + creator + '\'' +
                ", updator='" + updator + '\'' +
                '}';
    }
}
