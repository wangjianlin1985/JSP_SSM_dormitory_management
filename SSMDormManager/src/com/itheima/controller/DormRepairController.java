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
import com.itheima.po.DormRepair;
import com.itheima.po.PageInfo;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import com.itheima.service.DormRepairService;
import org.springframework.stereotype.Controller;

@Controller
public class DormRepairController
{
    @Autowired
    private DormRepairService dormRepairService;
    
    @RequestMapping({ "/findDormRepair" })
    public String findDormRepair(final Integer d_id, final String d_dormbuilding, final Integer pageIndex, final Integer pageSize, final Model model) {
        final PageInfo<DormRepair> di = this.dormRepairService.findPageInfo(d_id, d_dormbuilding, pageIndex, pageSize);
        model.addAttribute("di", (Object)di);
        return "dormrepair_list";
    }
    
    @RequestMapping(value = { "/exportdormrepairlist" }, method = { RequestMethod.POST })
    @ResponseBody
    public List<DormRepair> exportDormrepair() {
        final List<DormRepair> dormRepairList = this.dormRepairService.getAll();
        return dormRepairList;
    }
    
    @RequestMapping(value = { "/addDormRepair" }, method = { RequestMethod.POST })
    @ResponseBody
    public String addDormitory(@RequestBody final DormRepair dormrepair) {
        final int d = this.dormRepairService.addDormRepair(dormrepair);
        return "dormrepair_list";
    }
    
    @RequestMapping({ "/deleteDormRepair" })
    @ResponseBody
    public String deleteDormRepair(final Integer r_id) {
        final int d = this.dormRepairService.deleteDormRepair(r_id);
        return "dormrepair_list";
    }
    
    @RequestMapping({ "/updateDormRepair" })
    public String updateDormRepair(final DormRepair dormrepair) {
        final int d = this.dormRepairService.updateDormRepair(dormrepair);
        return "redirect:/findDormRepair";
    }
    
    @RequestMapping({ "/findDormRepairById" })
    public String findDormRepairById(final Integer r_id, final HttpSession session) {
        final DormRepair d = this.dormRepairService.findDormRepairById(r_id);
        session.setAttribute("d", (Object)d);
        return "dormrepair_edit";
    }
}
