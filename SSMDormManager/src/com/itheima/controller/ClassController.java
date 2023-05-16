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
import com.itheima.po.Class;
import com.itheima.po.PageInfo;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import com.itheima.service.ClassService;
import org.springframework.stereotype.Controller;

@Controller
public class ClassController
{
    @Autowired
    private ClassService classService;
    
    @RequestMapping({ "/findClass" })
    public String findClass(final Integer c_classid, final String c_classname, final String c_counsellor, final Integer pageIndex, final Integer pageSize, final Model model) {
        final PageInfo<Class> ci = this.classService.findPageInfo(c_classname, c_counsellor, c_classid, pageIndex, pageSize);
        model.addAttribute("ci", (Object)ci);
        model.addAttribute("c_classid", (Object)c_classid);
        return "class_list";
    }
    
    @RequestMapping(value = { "/exportclasslist" }, method = { RequestMethod.POST })
    @ResponseBody
    public List<Class> exportClass() {
        final List<Class> classList = this.classService.getAll();
        return classList;
    }
    
    @RequestMapping({ "/deleteClass" })
    @ResponseBody
    public String deleteClass(final Integer c_id) {
        final int c = this.classService.deleteClass(c_id);
        return "class_list";
    }
    
    @RequestMapping(value = { "/addClass" }, method = { RequestMethod.POST })
    @ResponseBody
    public String addClass(@RequestBody final Class uclass) {
        final int c = this.classService.addClass(uclass);
        return "class_list";
    }
    
    @RequestMapping({ "/findClassById" })
    public String findClassById(final Integer c_id, final HttpSession session) {
        final Class c = this.classService.findClassById(c_id);
        session.setAttribute("c", (Object)c);
        return "class_edit";
    }
    
    @RequestMapping(value = { "/updateClass" }, method = { RequestMethod.POST })
    public String updateClass(final Class uclass) {
        final int c = this.classService.updateClass(uclass);
        return "redirect:/findClass";
    }
    
    @RequestMapping({ "/findClassStudent" })
    public String findClassStudent(final Class uclass, final Model model) {
        final List<Class> c = this.classService.findClassStudent(uclass);
        model.addAttribute("cs", (Object)c);
        return "class_Studentlist";
    }
}
