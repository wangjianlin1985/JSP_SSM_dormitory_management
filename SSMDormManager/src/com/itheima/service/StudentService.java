// 
// 
// 

package com.itheima.service;

import java.util.List;
import com.itheima.po.Student;
import com.itheima.po.PageInfo;

public interface StudentService
{
    PageInfo<Student> findPageInfo(String p0, Integer p1, Integer p2, String p3, Integer p4, Integer p5);
    
    int deleteStudent(Integer p0);
    
    int addStudent(Student p0);
    
    int updateStudent(Student p0);
    
    Student findStudentById(Integer p0);
    
    List<Student> getAll();
}
