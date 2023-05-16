// 
// 
// 

package com.itheima.service.impl;

import java.util.List;
import com.itheima.po.Dormitory;
import com.itheima.po.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import com.itheima.dao.DormitoryDao;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.itheima.service.DormitoryService;

@Service("dormitoryService")
@Transactional
public class DormitoryServiceImpl implements DormitoryService
{
    @Autowired
    private DormitoryDao dormitoryDao;
    
    @Override
    public PageInfo<Dormitory> findPageInfo(final String a_name, final Integer s_dormitoryid, final String d_dormbuilding, final Integer pageIndex, final Integer pageSize) {
        final PageInfo<Dormitory> pi = new PageInfo<Dormitory>();
        pi.setPageIndex(pageIndex);
        pi.setPageSize(pageSize);
        final Integer totalCount = this.dormitoryDao.totalCount(a_name, s_dormitoryid, d_dormbuilding);
        if (totalCount > 0) {
            pi.setTotalCount(totalCount);
            final List<Dormitory> dormitoryList = this.dormitoryDao.getDormitoryList(a_name, s_dormitoryid, d_dormbuilding, (pi.getPageIndex() - 1) * pi.getPageSize(), pi.getPageSize());
            pi.setList(dormitoryList);
        }
        return pi;
    }
    
    @Override
    public List<Dormitory> getAll() {
        final List<Dormitory> dormitoryList = this.dormitoryDao.getAll();
        return dormitoryList;
    }
    
    @Override
    public int addDormitory(final Dormitory dormitory) {
        return this.dormitoryDao.addDormitory(dormitory);
    }
    
    @Override
    public int deleteDormitory(final Integer d_id) {
        return this.dormitoryDao.deleteDormitory(d_id);
    }
    
    @Override
    public int updateDormitory(final Dormitory dormitory) {
        return this.dormitoryDao.updateDormitory(dormitory);
    }
    
    @Override
    public Dormitory findDormitoryById(final Integer d_id) {
        final Dormitory d = this.dormitoryDao.findDormitoryById(d_id);
        return d;
    }
    
    @Override
    public List<Dormitory> findDormitoryStudent(final Dormitory dormitory) {
        final List<Dormitory> d = this.dormitoryDao.findDormitoryStudent(dormitory);
        return d;
    }
}
