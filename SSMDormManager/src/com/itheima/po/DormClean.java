// 
// 
// 

package com.itheima.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class DormClean
{
    private Integer g_id;
    private Integer d_id;
    private String d_dormbuilding;
    private Integer d_grade;
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
    
    public Integer getD_id() {
        return this.d_id;
    }
    
    public void setD_id(final Integer d_id) {
        this.d_id = d_id;
    }
    
    public String getD_dormbuilding() {
        return this.d_dormbuilding;
    }
    
    public void setD_dormbuilding(final String d_dormbuilding) {
        this.d_dormbuilding = d_dormbuilding;
    }
    
    public Integer getD_grade() {
        return this.d_grade;
    }
    
    public void setD_grade(final Integer d_grade) {
        this.d_grade = d_grade;
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
