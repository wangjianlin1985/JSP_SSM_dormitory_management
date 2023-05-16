// 
// 
// 

package com.itheima.po;

public class Student
{
    private static final long serialVersionUID = 1L;
    private Integer s_id;
    private Integer s_studentid;
    private String s_name;
    private String s_sex;
    private Integer s_age;
    private Integer s_phone;
    private Integer s_classid;
    private String s_classname;
    private Integer s_dormitoryid;
    
    public static long getSerialVersionUID() {
        return 1L;
    }
    
    public Integer getS_id() {
        return this.s_id;
    }
    
    public void setS_id(final Integer s_id) {
        this.s_id = s_id;
    }
    
    public Integer getS_studentid() {
        return this.s_studentid;
    }
    
    public void setS_studentid(final Integer s_studentid) {
        this.s_studentid = s_studentid;
    }
    
    public String getS_name() {
        return this.s_name;
    }
    
    public void setS_name(final String s_name) {
        this.s_name = s_name;
    }
    
    public String getS_sex() {
        return this.s_sex;
    }
    
    public void setS_sex(final String s_sex) {
        this.s_sex = s_sex;
    }
    
    public Integer getS_age() {
        return this.s_age;
    }
    
    public void setS_age(final Integer s_age) {
        this.s_age = s_age;
    }
    
    public Integer getS_phone() {
        return this.s_phone;
    }
    
    public void setS_phone(final Integer s_phone) {
        this.s_phone = s_phone;
    }
    
    public Integer getS_classid() {
        return this.s_classid;
    }
    
    public void setS_classid(final Integer s_classid) {
        this.s_classid = s_classid;
    }
    
    public String getS_classname() {
        return this.s_classname;
    }
    
    public void setS_classname(final String s_classname) {
        this.s_classname = s_classname;
    }
    
    public Integer getS_dormitoryid() {
        return this.s_dormitoryid;
    }
    
    public void setS_dormitoryid(final Integer s_dormitoryid) {
        this.s_dormitoryid = s_dormitoryid;
    }
}
