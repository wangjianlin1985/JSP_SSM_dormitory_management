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
import com.itheima.po.StudentClean;
import com.itheima.po.PageInfo;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import com.itheima.service.StudentCleanService;
import org.springframework.stereotype.Controller;

@Controller
public class StudentCleanController
{
    @Autowired
    private StudentCleanService studentCleanService;
    
    @RequestMapping({ "/findStudentClean" })
    public String findDormClean(final Integer s_studentid, final String s_name, final Integer s_dormitoryid, final Integer pageIndex, final Integer pageSize, final Model model) {
        final PageInfo<StudentClean> di = this.studentCleanService.findPageInfo(s_studentid, s_name, s_dormitoryid, pageIndex, pageSize);
        model.addAttribute("di", (Object)di);
        return "studentclean_list";
    }
    
    @RequestMapping(value = { "/exportstudentcleanlist" }, method = { RequestMethod.POST })
    @ResponseBody
    public List<StudentClean> exportStudentclean() {
        final List<StudentClean> studentCleanList = this.studentCleanService.getAll();
        return studentCleanList;
    }
    
    @RequestMapping(value = { "/addStudentClean" }, method = { RequestMethod.POST })
    @ResponseBody
    public String addDormClean(@RequestBody final StudentClean studentclean) {
        final int d = this.studentCleanService.addStudentClean(studentclean);
        return "studentclean_list";
    }
    
    @RequestMapping({ "/deleteStudentClean" })
    @ResponseBody
    public String deleteDormClean(final Integer g_id) {
        final int d = this.studentCleanService.deleteStudentClean(g_id);
        return "studentclean_list";
    }
    
    @RequestMapping({ "/updateStudentClean" })
    public String updateDormClean(final StudentClean studentclean) {
        final int d = this.studentCleanService.updateStudentClean(studentclean);
        return "redirect:/findStudentClean";
    }
    
    @RequestMapping({ "/findStudentCleanById" })
    public String findDormCleanById(final Integer g_id, final HttpSession session) {
        final StudentClean d = this.studentCleanService.findStudentCleanById(g_id);
        session.setAttribute("d", (Object)d);
        return "studentclean_edit";
    }
}
