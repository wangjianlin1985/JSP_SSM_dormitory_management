// 
// 
// 

package com.itheima.dao;

import com.itheima.po.Visitor;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitorDao
{
    Integer totalCount(@Param("v_name") String p0, @Param("v_phone") Integer p1);
    
    List<Visitor> getVisitorList(@Param("v_name") String p0, @Param("v_phone") Integer p1, @Param("currentPage") Integer p2, @Param("pageSize") Integer p3);
    
    int addVisitor(Visitor p0);
    
    List<Visitor> getAll();
}
