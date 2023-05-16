// 
// 
// 

package com.itheima.dao;

import com.itheima.po.DormRepair;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DormRepairDao
{
    Integer totalCount(@Param("d_id") Integer p0, @Param("d_dormbuilding") String p1);
    
    List<DormRepair> getDormRepairList(@Param("d_id") Integer p0, @Param("d_dormbuilding") String p1, @Param("currentPage") Integer p2, @Param("pageSize") Integer p3);
    
    int addDormRepair(DormRepair p0);
    
    int deleteDormRepair(Integer p0);
    
    int updateDormRepair(DormRepair p0);
    
    DormRepair findDormRepairById(Integer p0);
    
    List<DormRepair> getAll();
}
