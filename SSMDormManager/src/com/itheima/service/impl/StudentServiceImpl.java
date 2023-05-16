// 
// 
// 

package com.itheima.service.impl;

import java.util.List;
import com.itheima.po.Student;
import com.itheima.po.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import com.itheima.dao.StudentDao;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.itheima.service.StudentService;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService
{
    @Autowired
    private StudentDao studentDao;
    
    @Override
    public PageInfo<Student> findPageInfo(final String s_name, final Integer s_studentid, final Integer s_classid, final String s_classname, final Integer pageIndex, final Integer pageSize) {
        final PageInfo<Student> pi = new PageInfo<Student>();
        pi.setPageIndex(pageIndex);
        pi.setPageSize(pageSize);
        final Integer totalCount = this.studentDao.totalCount(s_name, s_studentid, s_classid, s_classname);
        if (totalCount > 0) {
            pi.setTotalCount(totalCount);
            final List<Student> studentList = this.studentDao.getStudentList(s_name, s_studentid, s_classid, s_classname, (pi.getPageIndex() - 1) * pi.getPageSize(), pi.getPageSize());
            pi.setList(studentList);
        }
        return pi;
    }
    
    @Override
    public List<Student> getAll() {
        final List<Student> studentList = this.studentDao.getAll();
        return studentList;
    }
    
    @Override
    public int deleteStudent(final Integer s_id) {
        return this.studentDao.deleteStudent(s_id);
    }
    
    @Override
    public int addStudent(final Student student) {
        return this.studentDao.addStudent(student);
    }
    
    @Override
    public int updateStudent(final Student student) {
        return this.studentDao.updateStudent(student);
    }
    
    @Override
    public Student findStudentById(final Integer s_id) {
        final Student s = this.studentDao.findStudentById(s_id);
        return s;
    }
}
