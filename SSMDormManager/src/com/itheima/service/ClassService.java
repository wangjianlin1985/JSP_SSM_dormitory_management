// 
// 
// 

package com.itheima.service;

import java.util.List;
import com.itheima.po.Class;
import com.itheima.po.PageInfo;

public interface ClassService
{
    PageInfo<Class> findPageInfo(String p0, String p1, Integer p2, Integer p3, Integer p4);
    
    int deleteClass(Integer p0);
    
    int addClass(Class p0);
    
    Class findClassById(Integer p0);
    
    int updateClass(Class p0);
    
    List<Class> findClassStudent(Class p0);
    
    List<Class> getAll();
}
