// 
// 
// 

package com.itheima.dao;

import com.itheima.po.DormClean;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DormCleanDao
{
    Integer totalCount(@Param("d_id") Integer p0, @Param("d_dormbuilding") String p1);
    
    List<DormClean> getDormCleanList(@Param("d_id") Integer p0, @Param("d_dormbuilding") String p1, @Param("currentPage") Integer p2, @Param("pageSize") Integer p3);
    
    int addDormClean(DormClean p0);
    
    int deleteDormClean(Integer p0);
    
    int updateDormClean(DormClean p0);
    
    DormClean findDormCleanById(Integer p0);
    
    List<DormClean> getAll();
}
