// 
// 
// 

package com.itheima.service;

import java.util.List;
import com.itheima.po.DormClean;
import com.itheima.po.PageInfo;

public interface DormCleanService
{
    PageInfo<DormClean> findPageInfo(Integer p0, String p1, Integer p2, Integer p3);
    
    int addDormClean(DormClean p0);
    
    int deleteDormClean(Integer p0);
    
    int updateDormClean(DormClean p0);
    
    DormClean findDormCleanById(Integer p0);
    
    List<DormClean> getAll();
}
