// 
// 
// 

package com.itheima.service;

import com.itheima.po.PageInfo;
import java.util.List;
import com.itheima.po.Admin;

public interface AdminService
{
    Admin findAdmin(Admin p0);
    
    List<Admin> getAll();
    
    PageInfo<Admin> findPageInfo(String p0, String p1, Integer p2, Integer p3, Integer p4);
    
    int addAdmin(Admin p0);
    
    int deleteAdmin(Integer p0);
    
    int updateAdmin(Admin p0);
    
    Admin findAdminById(Integer p0);
}
