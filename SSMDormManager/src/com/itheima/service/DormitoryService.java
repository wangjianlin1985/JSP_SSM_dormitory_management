// 
// 
// 

package com.itheima.service;

import java.util.List;
import com.itheima.po.Dormitory;
import com.itheima.po.PageInfo;

public interface DormitoryService
{
    PageInfo<Dormitory> findPageInfo(String p0, Integer p1, String p2, Integer p3, Integer p4);
    
    int addDormitory(Dormitory p0);
    
    int deleteDormitory(Integer p0);
    
    int updateDormitory(Dormitory p0);
    
    Dormitory findDormitoryById(Integer p0);
    
    List<Dormitory> findDormitoryStudent(Dormitory p0);
    
    List<Dormitory> getAll();
}
