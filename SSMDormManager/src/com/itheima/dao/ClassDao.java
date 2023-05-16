// 
// 
// 

package com.itheima.dao;

import com.itheima.po.Class;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassDao
{
    Integer totalCount(@Param("c_classname") String p0, @Param("c_classid") Integer p1, @Param("c_counsellor") String p2);
    
    List<Class> getClassList(@Param("c_classname") String p0, @Param("c_classid") Integer p1, @Param("c_counsellor") String p2, @Param("currentPage") Integer p3, @Param("pageSize") Integer p4);
    
    int deleteClass(Integer p0);
    
    int addClass(Class p0);
    
    int updateClass(Class p0);
    
    Class findClassById(Integer p0);
    
    List<Class> findClassStudent(Class p0);
    
    List<Class> getAll();
}
