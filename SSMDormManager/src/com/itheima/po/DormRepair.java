// 
// 
// 

package com.itheima.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class DormRepair
{
    private int r_id;
    private int d_id;
    private int d_dormbuilding;
    private String r_name;
    private String reason;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date create_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date update_time;
    
    public int getR_id() {
        return this.r_id;
    }
    
    public void setR_id(final int r_id) {
        this.r_id = r_id;
    }
    
    public int getD_id() {
        return this.d_id;
    }
    
    public void setD_id(final int d_id) {
        this.d_id = d_id;
    }
    
    public int getD_dormbuilding() {
        return this.d_dormbuilding;
    }
    
    public void setD_dormbuilding(final int d_dormbuilding) {
        this.d_dormbuilding = d_dormbuilding;
    }
    
    public String getR_name() {
        return this.r_name;
    }
    
    public void setR_name(final String r_name) {
        this.r_name = r_name;
    }
    
    public String getReason() {
        return this.reason;
    }
    
    public void setReason(final String reason) {
        this.reason = reason;
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
