// 
// 
// 

package com.itheima.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.itheima.po.Admin;

public interface AdminDao
{
    Admin findAdmin(Admin p0);
    
    Integer totalCount(@Param("a_username") String p0, @Param("a_describe") String p1, @Param("a_id") Integer p2);
    
    List<Admin> getAdminList(@Param("a_username") String p0, @Param("a_describe") String p1, @Param("a_id") Integer p2, @Param("currentPage") Integer p3, @Param("pageSize") Integer p4);
    
    int addAdmin(Admin p0);
    
    int deleteAdmin(Integer p0);
    
    int updateAdmin(Admin p0);
    
    Admin findAdminById(Integer p0);
    
    List<Admin> getAll();
}
