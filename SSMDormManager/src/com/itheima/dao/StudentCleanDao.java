// 
// 
// 

package com.itheima.dao;

import com.itheima.po.StudentClean;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentCleanDao
{
    Integer totalCount(@Param("s_studentid") Integer p0, @Param("s_name") String p1, @Param("s_dormitoryid") Integer p2);
    
    List<StudentClean> getStudentCleanList(@Param("s_studentid") Integer p0, @Param("s_name") String p1, @Param("s_dormitoryid") Integer p2, @Param("currentPage") Integer p3, @Param("pageSize") Integer p4);
    
    int addStudentClean(StudentClean p0);
    
    int deleteStudentClean(Integer p0);
    
    int updateStudentClean(StudentClean p0);
    
    StudentClean findStudentCleanById(Integer p0);
    
    List<StudentClean> getAll();
}
