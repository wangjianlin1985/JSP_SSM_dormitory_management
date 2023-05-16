// 
// 
// 

package com.itheima.po;

import java.util.List;

public class Class
{
    private Integer c_id;
    private Integer c_classid;
    private String c_classname;
    private String c_counsellor;
    private List<Student> students;
    
    public Integer getC_id() {
        return this.c_id;
    }
    
    public void setC_id(final Integer c_id) {
        this.c_id = c_id;
    }
    
    public Integer getC_classid() {
        return this.c_classid;
    }
    
    public void setC_classid(final Integer c_classid) {
        this.c_classid = c_classid;
    }
    
    public String getC_classname() {
        return this.c_classname;
    }
    
    public void setC_classname(final String c_classname) {
        this.c_classname = c_classname;
    }
    
    public String getC_counsellor() {
        return this.c_counsellor;
    }
    
    public void setC_counsellor(final String c_counsellor) {
        this.c_counsellor = c_counsellor;
    }
    
    public List<Student> getStudents() {
        return this.students;
    }
    
    public void setStudents(final List<Student> students) {
        this.students = students;
    }
}
