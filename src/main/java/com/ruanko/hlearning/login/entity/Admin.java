package com.ruanko.hlearning.login.entity;

/**
 * entity:管理员
 */
public class Admin {
    private int mg_id;
    private String mg_name;
    private String mg_password;
    private String mg_email;
    private String mg_phone;
    private String mg_state;
    private String createtime;
    private String updatetime;
    private String creator;
    private String updator;

    public Admin() {
    }

    public Admin(int mg_id, String mg_name, String mg_password, String mg_email, String mg_phone, String mg_state, String createtime, String updatetime, String creator, String updator) {
        this.mg_id = mg_id;
        this.mg_name = mg_name;
        this.mg_password = mg_password;
        this.mg_email = mg_email;
        this.mg_phone = mg_phone;
        this.mg_state = mg_state;
        this.createtime = createtime;
        this.updatetime = updatetime;
        this.creator = creator;
        this.updator = updator;
    }

    public int getMg_id() {
        return mg_id;
    }

    public void setMg_id(int mg_id) {
        this.mg_id = mg_id;
    }

    public String getMg_name() {
        return mg_name;
    }

    public void setMg_name(String mg_name) {
        this.mg_name = mg_name;
    }

    public String getMg_password() {
        return mg_password;
    }

    public void setMg_password(String mg_password) {
        this.mg_password = mg_password;
    }

    public String getMg_email() {
        return mg_email;
    }

    public void setMg_email(String mg_email) {
        this.mg_email = mg_email;
    }

    public String getMg_phone() {
        return mg_phone;
    }

    public void setMg_phone(String mg_phone) {
        this.mg_phone = mg_phone;
    }

    public String getMg_state() {
        return mg_state;
    }

    public void setMg_state(String mg_state) {
        this.mg_state = mg_state;
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
        return "manager{" +
                "mg_id=" + mg_id +
                ", mg_name='" + mg_name + '\'' +
                ", mg_password='" + mg_password + '\'' +
                ", mg_email='" + mg_email + '\'' +
                ", mg_phone='" + mg_phone + '\'' +
                ", mg_state='" + mg_state + '\'' +
                ", createtime='" + createtime + '\'' +
                ", updatetime='" + updatetime + '\'' +
                ", creator='" + creator + '\'' +
                ", updator='" + updator + '\'' +
                '}';
    }
}
