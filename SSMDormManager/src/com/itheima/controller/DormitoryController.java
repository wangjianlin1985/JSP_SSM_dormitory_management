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
import com.itheima.po.Dormitory;
import com.itheima.po.PageInfo;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import com.itheima.service.DormitoryService;
import org.springframework.stereotype.Controller;

@Controller
public class DormitoryController
{
    @Autowired
    private DormitoryService dormitoryService;
    
    @RequestMapping({ "/findDormitory" })
    public String findDormitory(final String a_name, final Integer s_dormitoryid, final String d_dormbuilding, final Integer pageIndex, final Integer pageSize, final Model model) {
        final PageInfo<Dormitory> di = this.dormitoryService.findPageInfo(a_name, s_dormitoryid, d_dormbuilding, pageIndex, pageSize);
        model.addAttribute("di", (Object)di);
        return "dormitory_list";
    }
    
    @RequestMapping(value = { "/exportdormitorylist" }, method = { RequestMethod.POST })
    @ResponseBody
    public List<Dormitory> exportDormitory() {
        final List<Dormitory> dormitoryList = this.dormitoryService.getAll();
        return dormitoryList;
    }
    
    @RequestMapping(value = { "/addDormitory" }, method = { RequestMethod.POST })
    @ResponseBody
    public String addDormitory(@RequestBody final Dormitory dormitory) {
        final int d = this.dormitoryService.addDormitory(dormitory);
        return "dormitory_list";
    }
    
    @RequestMapping({ "/deleteDormitory" })
    @ResponseBody
    public String deleteDormitory(final Integer d_id) {
        final int d = this.dormitoryService.deleteDormitory(d_id);
        return "dormitory_list";
    }
    
    @RequestMapping({ "/updateDormitory" })
    public String updateDormitory(final Dormitory dormitory) {
        final int d = this.dormitoryService.updateDormitory(dormitory);
        return "redirect:/findDormitory";
    }
    
    @RequestMapping({ "/findDormitoryById" })
    public String findDormitoryById(final Integer d_id, final HttpSession session) {
        final Dormitory d = this.dormitoryService.findDormitoryById(d_id);
        session.setAttribute("d", (Object)d);
        return "dormitory_edit";
    }
    
    @RequestMapping({ "/findDormitoryStudent" })
    public String findDormitoryStudent(final Dormitory dormitory, final Model model) {
        final List<Dormitory> d = this.dormitoryService.findDormitoryStudent(dormitory);
        model.addAttribute("ds", (Object)d);
        return "dormitory_Studentlist";
    }
}
