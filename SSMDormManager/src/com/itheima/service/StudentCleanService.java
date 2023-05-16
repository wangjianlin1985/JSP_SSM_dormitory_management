// 
// 
// 

package com.itheima.service;

import java.util.List;
import com.itheima.po.StudentClean;
import com.itheima.po.PageInfo;

public interface StudentCleanService
{
    PageInfo<StudentClean> findPageInfo(Integer p0, String p1, Integer p2, Integer p3, Integer p4);
    
    int addStudentClean(StudentClean p0);
    
    int deleteStudentClean(Integer p0);
    
    int updateStudentClean(StudentClean p0);
    
    StudentClean findStudentCleanById(Integer p0);
    
    List<StudentClean> getAll();
}
