// 
// 
// 

package com.itheima.dao;

import com.itheima.po.Dormitory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DormitoryDao
{
    Integer totalCount(@Param("a_name") String p0, @Param("s_dormitoryid") Integer p1, @Param("d_dormbuilding") String p2);
    
    List<Dormitory> getDormitoryList(@Param("a_name") String p0, @Param("s_dormitoryid") Integer p1, @Param("d_dormbuilding") String p2, @Param("currentPage") Integer p3, @Param("pageSize") Integer p4);
    
    int addDormitory(Dormitory p0);
    
    int deleteDormitory(Integer p0);
    
    int updateDormitory(Dormitory p0);
    
    Dormitory findDormitoryById(Integer p0);
    
    List<Dormitory> findDormitoryStudent(Dormitory p0);
    
    List<Dormitory> getAll();
}
