// 
// 
// 

package com.itheima.service.impl;

import com.itheima.po.PageInfo;
import java.util.List;
import com.itheima.po.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import com.itheima.dao.AdminDao;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.itheima.service.AdminService;

@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService
{
    @Autowired
    private AdminDao adminDao;
    
    @Override
    public Admin findAdmin(final Admin admin) {
        final Admin a = this.adminDao.findAdmin(admin);
        return a;
    }
    
    @Override
    public List<Admin> getAll() {
        final List<Admin> adminList = this.adminDao.getAll();
        return adminList;
    }
    
    @Override
    public PageInfo<Admin> findPageInfo(final String a_username, final String a_describe, final Integer a_id, final Integer pageIndex, final Integer pageSize) {
        final PageInfo<Admin> pi = new PageInfo<Admin>();
        pi.setPageIndex(pageIndex);
        pi.setPageSize(pageSize);
        final Integer totalCount = this.adminDao.totalCount(a_username, a_describe, a_id);
        if (totalCount > 0) {
            pi.setTotalCount(totalCount);
            final List<Admin> adminList = this.adminDao.getAdminList(a_username, a_describe, a_id, (pi.getPageIndex() - 1) * pi.getPageSize(), pi.getPageSize());
            pi.setList(adminList);
        }
        return pi;
    }
    
    @Override
    public int addAdmin(final Admin admin) {
        return this.adminDao.addAdmin(admin);
    }
    
    @Override
    public int deleteAdmin(final Integer a_id) {
        return this.adminDao.deleteAdmin(a_id);
    }
    
    @Override
    public int updateAdmin(final Admin admin) {
        return this.adminDao.updateAdmin(admin);
    }
    
    @Override
    public Admin findAdminById(final Integer a_id) {
        final Admin a = this.adminDao.findAdminById(a_id);
        return a;
    }
}
