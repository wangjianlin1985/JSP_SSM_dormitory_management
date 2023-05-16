// 
// 
// 

package com.itheima.service.impl;

import java.util.List;
import com.itheima.po.DormRepair;
import com.itheima.po.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import com.itheima.dao.DormRepairDao;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.itheima.service.DormRepairService;

@Service("dormRepairService")
@Transactional
public class DormRepairServiceImpl implements DormRepairService
{
    @Autowired
    private DormRepairDao dormRepairDao;
    
    @Override
    public PageInfo<DormRepair> findPageInfo(final Integer d_id, final String d_dormbuilding, final Integer pageIndex, final Integer pageSize) {
        final PageInfo<DormRepair> pi = new PageInfo<DormRepair>();
        pi.setPageIndex(pageIndex);
        pi.setPageSize(pageSize);
        final Integer totalCount = this.dormRepairDao.totalCount(d_id, d_dormbuilding);
        if (totalCount > 0) {
            pi.setTotalCount(totalCount);
            final List<DormRepair> dormRepairList = this.dormRepairDao.getDormRepairList(d_id, d_dormbuilding, (pi.getPageIndex() - 1) * pi.getPageSize(), pi.getPageSize());
            pi.setList(dormRepairList);
        }
        return pi;
    }
    
    @Override
    public List<DormRepair> getAll() {
        final List<DormRepair> dormRepairList = this.dormRepairDao.getAll();
        return dormRepairList;
    }
    
    @Override
    public int addDormRepair(final DormRepair dormrepair) {
        return this.dormRepairDao.addDormRepair(dormrepair);
    }
    
    @Override
    public int deleteDormRepair(final Integer r_id) {
        return this.dormRepairDao.deleteDormRepair(r_id);
    }
    
    @Override
    public int updateDormRepair(final DormRepair dormrepair) {
        return this.dormRepairDao.updateDormRepair(dormrepair);
    }
    
    @Override
    public DormRepair findDormRepairById(final Integer r_id) {
        final DormRepair d = this.dormRepairDao.findDormRepairById(r_id);
        return d;
    }
}
