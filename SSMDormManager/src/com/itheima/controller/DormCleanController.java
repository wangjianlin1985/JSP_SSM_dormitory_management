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
import com.itheima.po.DormClean;
import com.itheima.po.PageInfo;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import com.itheima.service.DormCleanService;
import org.springframework.stereotype.Controller;

@Controller
public class DormCleanController
{
    @Autowired
    private DormCleanService dormCleanService;
    
    @RequestMapping({ "/findDormClean" })
    public String findDormClean(final Integer d_id, final String d_dormbuilding, final Integer pageIndex, final Integer pageSize, final Model model) {
        final PageInfo<DormClean> di = this.dormCleanService.findPageInfo(d_id, d_dormbuilding, pageIndex, pageSize);
        model.addAttribute("di", (Object)di);
        return "dormclean_list";
    }
    
    @RequestMapping(value = { "/exportdormcleanlist" }, method = { RequestMethod.POST })
    @ResponseBody
    public List<DormClean> exportDormclean() {
        final List<DormClean> dormclean = this.dormCleanService.getAll();
        return dormclean;
    }
    
    @RequestMapping(value = { "/addDormClean" }, method = { RequestMethod.POST })
    @ResponseBody
    public String addDormClean(@RequestBody final DormClean dormclean) {
        final int d = this.dormCleanService.addDormClean(dormclean);
        return "dormclean_list";
    }
    
    @RequestMapping({ "/deleteDormClean" })
    @ResponseBody
    public String deleteDormClean(final Integer g_id) {
        final int d = this.dormCleanService.deleteDormClean(g_id);
        return "dormclean_list";
    }
    
    @RequestMapping({ "/updateDormClean" })
    public String updateDormClean(final DormClean dormclean) {
        final int d = this.dormCleanService.updateDormClean(dormclean);
        return "redirect:/findDormClean";
    }
    
    @RequestMapping({ "/findDormCleanById" })
    public String findDormCleanById(final Integer g_id, final HttpSession session) {
        final DormClean d = this.dormCleanService.findDormCleanById(g_id);
        session.setAttribute("d", (Object)d);
        return "dormclean_edit";
    }
}
