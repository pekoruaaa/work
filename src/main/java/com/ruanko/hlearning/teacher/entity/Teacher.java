package com.ruanko.hlearning.teacher.entity;
/**
 * entity:教师
 */
public class Teacher {
    private int tc_id;
    private String tc_name;
    private String tc_password;
    private String tc_email;
    private String tc_phone;
    private String tc_introduce;
    private String tc_image;
    private int tc_state;
    private String createtime;
    private String updatetime;
    private String creator;
    private String updator;

    public int getTc_id() {
        return tc_id;
    }

    public void setTc_id(int tc_id) {
        this.tc_id = tc_id;
    }

    public String getTc_name() {
        return tc_name;
    }

    public void setTc_name(String tc_name) {
        this.tc_name = tc_name;
    }

    public String getTc_password() {
        return tc_password;
    }

    public void setTc_password(String tc_password) {
        this.tc_password = tc_password;
    }

    public String getTc_email() {
        return tc_email;
    }

    public void setTc_email(String tc_email) {
        this.tc_email = tc_email;
    }

    public String getTc_phone() {
        return tc_phone;
    }

    public void setTc_phone(String tc_phone) {
        this.tc_phone = tc_phone;
    }

    public String getTc_introduce() {
        return tc_introduce;
    }

    public void setTc_introduce(String tc_introduce) {
        this.tc_introduce = tc_introduce;
    }

    public String getTc_image() {
        return tc_image;
    }

    public void setTc_image(String tc_image) {
        this.tc_image = tc_image;
    }

    public int getTc_state() {
        return tc_state;
    }

    public void setTc_state(int tc_state) {
        this.tc_state = tc_state;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
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
        return "Teacher{" +
                "tc_id=" + tc_id +
                ", tc_name='" + tc_name + '\'' +
                ", tc_password='" + tc_password + '\'' +
                ", tc_email='" + tc_email + '\'' +
                ", tc_phone='" + tc_phone + '\'' +
                ", tc_introduce='" + tc_introduce + '\'' +
                ", tc_image='" + tc_image + '\'' +
                ", tc_state='" + tc_state + '\'' +
                ", createtime='" + createtime + '\'' +
                ", updatetime='" + updatetime + '\'' +
                ", creator='" + creator + '\'' +
                ", updator='" + updator + '\'' +
                '}';
    }
}
