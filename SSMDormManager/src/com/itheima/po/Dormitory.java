// 
// 
// 

package com.itheima.po;

import java.util.List;
import java.io.Serializable;

public class Dormitory implements Serializable
{
    private static final long serialVersionUID = 1L;
    private Integer d_id;
    private Integer s_dormitoryid;
    private String d_dormbuilding;
    private String d_bedtotal;
    private String d_bed;
    private String a_name;
    private List<Student> students;
    
    public static long getSerialVersionUID() {
        return 1L;
    }
    
    public Integer getD_id() {
        return this.d_id;
    }
    
    public void setD_id(final Integer d_id) {
        this.d_id = d_id;
    }
    
    public Integer getS_dormitoryid() {
        return this.s_dormitoryid;
    }
    
    public void setS_dormitoryid(final Integer s_dormitoryid) {
        this.s_dormitoryid = s_dormitoryid;
    }
    
    public String getD_dormbuilding() {
        return this.d_dormbuilding;
    }
    
    public void setD_dormbuilding(final String d_dormbuilding) {
        this.d_dormbuilding = d_dormbuilding;
    }
    
    public String getD_bedtotal() {
        return this.d_bedtotal;
    }
    
    public void setD_bedtotal(final String d_bedtotal) {
        this.d_bedtotal = d_bedtotal;
    }
    
    public String getD_bed() {
        return this.d_bed;
    }
    
    public void setD_bed(final String d_bed) {
        this.d_bed = d_bed;
    }
    
    public String getA_name() {
        return this.a_name;
    }
    
    public void setA_name(final String a_name) {
        this.a_name = a_name;
    }
    
    public List<Student> getStudents() {
        return this.students;
    }
    
    public void setStudents(final List<Student> students) {
        this.students = students;
    }
}
