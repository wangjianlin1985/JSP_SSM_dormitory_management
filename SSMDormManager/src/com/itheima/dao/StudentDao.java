// 
// 
// 

package com.itheima.dao;

import com.itheima.po.Student;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentDao
{
    Integer totalCount(@Param("s_name") String p0, @Param("s_studentid") Integer p1, @Param("s_classid") Integer p2, @Param("s_classname") String p3);
    
    List<Student> getStudentList(@Param("s_name") String p0, @Param("s_studentid") Integer p1, @Param("s_classid") Integer p2, @Param("s_classname") String p3, @Param("currentPage") Integer p4, @Param("pageSize") Integer p5);
    
    int deleteStudent(Integer p0);
    
    int addStudent(Student p0);
    
    int updateStudent(Student p0);
    
    Student findStudentById(Integer p0);
    
    List<Student> getAll();
}
