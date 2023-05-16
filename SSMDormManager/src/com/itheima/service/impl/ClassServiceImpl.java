// 
// 
// 

package com.itheima.service.impl;

import java.util.List;
import com.itheima.po.Class;
import com.itheima.po.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import com.itheima.dao.ClassDao;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.itheima.service.ClassService;

@Service("classService")
@Transactional
public class ClassServiceImpl implements ClassService
{
    @Autowired
    private ClassDao classDao;
    
    @Override
    public PageInfo<Class> findPageInfo(final String c_classname, final String c_counsellor, final Integer c_classid, final Integer pageIndex, final Integer pageSize) {
        final PageInfo<Class> pi = new PageInfo<Class>();
        pi.setPageIndex(pageIndex);
        pi.setPageSize(pageSize);
        final Integer totalCount = this.classDao.totalCount(c_classname, c_classid, c_counsellor);
        if (totalCount > 0) {
            pi.setTotalCount(totalCount);
            final List<Class> classList = this.classDao.getClassList(c_classname, c_classid, c_counsellor, (pi.getPageIndex() - 1) * pi.getPageSize(), pi.getPageSize());
            pi.setList(classList);
        }
        return pi;
    }
    
    @Override
    public List<Class> getAll() {
        final List<Class> classList = this.classDao.getAll();
        return classList;
    }
    
    @Override
    public int deleteClass(final Integer c_id) {
        return this.classDao.deleteClass(c_id);
    }
    
    @Override
    public int addClass(final Class uclass) {
        return this.classDao.addClass(uclass);
    }
    
    @Override
    public Class findClassById(final Integer c_id) {
        final Class c = this.classDao.findClassById(c_id);
        return c;
    }
    
    @Override
    public int updateClass(final Class uclass) {
        return this.classDao.updateClass(uclass);
    }
    
    @Override
    public List<Class> findClassStudent(final Class uclass) {
        final List<Class> c = this.classDao.findClassStudent(uclass);
        return c;
    }
}
