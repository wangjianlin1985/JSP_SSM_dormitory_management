// 
// 
// 

package com.itheima.service;

import java.util.List;
import com.itheima.po.Visitor;
import com.itheima.po.PageInfo;

public interface VisitorService
{
    PageInfo<Visitor> findPageInfo(String p0, Integer p1, Integer p2, Integer p3);
    
    int addVisitor(Visitor p0);
    
    List<Visitor> getAll();
}
