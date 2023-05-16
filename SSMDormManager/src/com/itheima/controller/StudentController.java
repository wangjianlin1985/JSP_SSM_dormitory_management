// 
// 
// 

package com.itheima.controller;

import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import com.itheima.po.Student;
import com.itheima.po.PageInfo;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import com.itheima.service.StudentService;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController
{
    @Autowired
    private StudentService studentService;
    
    @RequestMapping({ "/findStudent" })
    public String findStudent(final String s_name, final Integer s_studentid, final Integer s_classid, final String s_classname, final Integer pageIndex, final Integer pageSize, final Model model) {
        final PageInfo<Student> pi = this.studentService.findPageInfo(s_name, s_studentid, s_classid, s_classname, pageIndex, pageSize);
        model.addAttribute("pi", (Object)pi);
        model.addAttribute("s_name", (Object)s_name);
        return "student_list";
    }
    
    @RequestMapping(value = { "/exportstudentlist" }, method = { RequestMethod.POST })
    @ResponseBody
    public List<Student> exportStudent() {
        final List<Student> studentList = this.studentService.getAll();
        return studentList;
    }
    
    @RequestMapping({ "/deleteStudent" })
    @ResponseBody
    public String deleteStudent(final Integer s_id) {
        final int s = this.studentService.deleteStudent(s_id);
        return "student_list";
    }
    
    @RequestMapping(value = { "/addStudent" }, method = { RequestMethod.POST })
    @ResponseBody
    public String addStudent(@RequestBody final Student student) {
        final int s = this.studentService.addStudent(student);
        return "student_list";
    }
    
    @RequestMapping(value = { "/updateStudent" }, method = { RequestMethod.POST })
    public String updateStudent(final Student student) {
        final int s = this.studentService.updateStudent(student);
        return "redirect:/findStudent";
    }
    
    @RequestMapping({ "/findStudentById" })
    public String findStudentById(final Integer s_id, final HttpSession session) {
        final Student s = this.studentService.findStudentById(s_id);
        session.setAttribute("s", (Object)s);
        return "student_edit";
    }
}
