// 
// 
// 

package com.itheima.service.impl;

import java.util.List;
import com.itheima.po.DormClean;
import com.itheima.po.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import com.itheima.dao.DormCleanDao;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.itheima.service.DormCleanService;

@Service("dormCleanService")
@Transactional
public class DormCleanServiceImpl implements DormCleanService
{
    @Autowired
    private DormCleanDao dormCleanDao;
    
    @Override
    public PageInfo<DormClean> findPageInfo(final Integer d_id, final String d_dormbuilding, final Integer pageIndex, final Integer pageSize) {
        final PageInfo<DormClean> pi = new PageInfo<DormClean>();
        pi.setPageIndex(pageIndex);
        pi.setPageSize(pageSize);
        final Integer totalCount = this.dormCleanDao.totalCount(d_id, d_dormbuilding);
        if (totalCount > 0) {
            pi.setTotalCount(totalCount);
            final List<DormClean> dormCleanList = this.dormCleanDao.getDormCleanList(d_id, d_dormbuilding, (pi.getPageIndex() - 1) * pi.getPageSize(), pi.getPageSize());
            pi.setList(dormCleanList);
        }
        return pi;
    }
    
    @Override
    public List<DormClean> getAll() {
        final List<DormClean> dormCleanList = this.dormCleanDao.getAll();
        return dormCleanList;
    }
    
    @Override
    public int addDormClean(final DormClean dormclean) {
        return this.dormCleanDao.addDormClean(dormclean);
    }
    
    @Override
    public int deleteDormClean(final Integer g_id) {
        return this.dormCleanDao.deleteDormClean(g_id);
    }
    
    @Override
    public int updateDormClean(final DormClean dormclean) {
        return this.dormCleanDao.updateDormClean(dormclean);
    }
    
    @Override
    public DormClean findDormCleanById(final Integer g_id) {
        final DormClean d = this.dormCleanDao.findDormCleanById(g_id);
        return d;
    }
}
