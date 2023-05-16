// 
// 
// 

package com.itheima.service;

import java.util.List;
import com.itheima.po.DormRepair;
import com.itheima.po.PageInfo;

public interface DormRepairService
{
    PageInfo<DormRepair> findPageInfo(Integer p0, String p1, Integer p2, Integer p3);
    
    int addDormRepair(DormRepair p0);
    
    int deleteDormRepair(Integer p0);
    
    int updateDormRepair(DormRepair p0);
    
    DormRepair findDormRepairById(Integer p0);
    
    List<DormRepair> getAll();
}
