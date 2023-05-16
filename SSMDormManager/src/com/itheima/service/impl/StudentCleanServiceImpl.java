// 
// 
// 

package com.itheima.service.impl;

import java.util.List;
import com.itheima.po.StudentClean;
import com.itheima.po.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import com.itheima.dao.StudentCleanDao;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.itheima.service.StudentCleanService;

@Service("studentCleanService")
@Transactional
public class StudentCleanServiceImpl implements StudentCleanService
{
    @Autowired
    private StudentCleanDao studentCleanDao;
    
    @Override
    public PageInfo<StudentClean> findPageInfo(final Integer s_studentid, final String s_name, final Integer s_dormitoryid, final Integer pageIndex, final Integer pageSize) {
        final PageInfo<StudentClean> pi = new PageInfo<StudentClean>();
        pi.setPageIndex(pageIndex);
        pi.setPageSize(pageSize);
        final Integer totalCount = this.studentCleanDao.totalCount(s_studentid, s_name, s_dormitoryid);
        if (totalCount > 0) {
            pi.setTotalCount(totalCount);
            final List<StudentClean> studentCleanList = this.studentCleanDao.getStudentCleanList(s_studentid, s_name, s_dormitoryid, (pi.getPageIndex() - 1) * pi.getPageSize(), pi.getPageSize());
            pi.setList(studentCleanList);
        }
        return pi;
    }
    
    @Override
    public List<StudentClean> getAll() {
        final List<StudentClean> studentCleanList = this.studentCleanDao.getAll();
        return studentCleanList;
    }
    
    @Override
    public int addStudentClean(final StudentClean studentclean) {
        return this.studentCleanDao.addStudentClean(studentclean);
    }
    
    @Override
    public int deleteStudentClean(final Integer g_id) {
        return this.studentCleanDao.deleteStudentClean(g_id);
    }
    
    @Override
    public int updateStudentClean(final StudentClean studentclean) {
        return this.studentCleanDao.updateStudentClean(studentclean);
    }
    
    @Override
    public StudentClean findStudentCleanById(final Integer g_id) {
        final StudentClean d = this.studentCleanDao.findStudentCleanById(g_id);
        return d;
    }
}
