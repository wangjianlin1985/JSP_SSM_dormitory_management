// 
// 
// 

package com.itheima.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class StudentClean
{
    private Integer g_id;
    private Integer s_studentid;
    private String s_name;
    private Integer s_grade;
    private Integer s_classid;
    private Integer s_dormitoryid;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date create_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date update_time;
    
    public Integer getG_id() {
        return this.g_id;
    }
    
    public void setG_id(final Integer g_id) {
        this.g_id = g_id;
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
    
    public Integer getS_grade() {
        return this.s_grade;
    }
    
    public void setS_grade(final Integer s_grade) {
        this.s_grade = s_grade;
    }
    
    public Integer getS_classid() {
        return this.s_classid;
    }
    
    public void setS_classid(final Integer s_classid) {
        this.s_classid = s_classid;
    }
    
    public Integer getS_dormitoryid() {
        return this.s_dormitoryid;
    }
    
    public void setS_dormitoryid(final Integer s_dormtoryid) {
        this.s_dormitoryid = s_dormtoryid;
    }
    
    public Date getCreate_time() {
        return this.create_time;
    }
    
    public void setCreate_time(final Date create_time) {
        this.create_time = create_time;
    }
    
    public Date getUpdate_time() {
        return this.update_time;
    }
    
    public void setUpdate_time(final Date update_time) {
        this.update_time = update_time;
    }
}
