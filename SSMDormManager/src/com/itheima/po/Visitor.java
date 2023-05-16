// 
// 
// 

package com.itheima.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class Visitor
{
    private Integer v_id;
    private String v_name;
    private Integer v_phone;
    private Integer v_dormitoryid;
    private String v_dormbuilding;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date create_time;
    
    public Integer getV_id() {
        return this.v_id;
    }
    
    public void setV_id(final Integer v_id) {
        this.v_id = v_id;
    }
    
    public String getV_name() {
        return this.v_name;
    }
    
    public void setV_name(final String v_name) {
        this.v_name = v_name;
    }
    
    public Integer getV_phone() {
        return this.v_phone;
    }
    
    public void setV_phone(final Integer v_phone) {
        this.v_phone = v_phone;
    }
    
    public Integer getV_dormitoryid() {
        return this.v_dormitoryid;
    }
    
    public void setV_dormitoryid(final Integer v_dormitoryid) {
        this.v_dormitoryid = v_dormitoryid;
    }
    
    public String getV_dormbuilding() {
        return this.v_dormbuilding;
    }
    
    public void setV_dormbuilding(final String v_dormbuilding) {
        this.v_dormbuilding = v_dormbuilding;
    }
    
    public Date getCreate_time() {
        return this.create_time;
    }
    
    public void setCreate_time(final Date create_time) {
        this.create_time = create_time;
    }
}
