// 
// 
// 

package com.itheima.service.impl;

import java.util.List;
import com.itheima.po.Visitor;
import com.itheima.po.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import com.itheima.dao.VisitorDao;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.itheima.service.VisitorService;

@Service("visitorService")
@Transactional
public class VisitorServiceImpl implements VisitorService
{
    @Autowired
    private VisitorDao visitorDao;
    
    @Override
    public PageInfo<Visitor> findPageInfo(final String v_name, final Integer v_phone, final Integer pageIndex, final Integer pageSize) {
        final PageInfo<Visitor> pi = new PageInfo<Visitor>();
        pi.setPageIndex(pageIndex);
        pi.setPageSize(pageSize);
        final Integer totalCount = this.visitorDao.totalCount(v_name, v_phone);
        if (totalCount > 0) {
            pi.setTotalCount(totalCount);
            final List<Visitor> visitorList = this.visitorDao.getVisitorList(v_name, v_phone, (pi.getPageIndex() - 1) * pi.getPageSize(), pi.getPageSize());
            pi.setList(visitorList);
        }
        return pi;
    }
    
    @Override
    public List<Visitor> getAll() {
        final List<Visitor> visitorList = this.visitorDao.getAll();
        return visitorList;
    }
    
    @Override
    public int addVisitor(final Visitor visitor) {
        return this.visitorDao.addVisitor(visitor);
    }
}
