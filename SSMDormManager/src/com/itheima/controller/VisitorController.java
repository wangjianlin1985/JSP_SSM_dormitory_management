// 
// 
// 

package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import com.itheima.po.Visitor;
import com.itheima.po.PageInfo;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import com.itheima.service.VisitorService;
import org.springframework.stereotype.Controller;

@Controller
public class VisitorController
{
    @Autowired
    private VisitorService visitorService;
    
    @RequestMapping({ "/findVisitor" })
    public String findVisitor(final String v_name, final Integer v_phone, final Integer pageIndex, final Integer pageSize, final Model model) {
        final PageInfo<Visitor> pi = this.visitorService.findPageInfo(v_name, v_phone, pageIndex, pageSize);
        model.addAttribute("pi", (Object)pi);
        model.addAttribute("v_name", (Object)v_name);
        return "visitor_list";
    }
    
    @RequestMapping(value = { "/exportvisitorlist" }, method = { RequestMethod.POST })
    @ResponseBody
    public List<Visitor> exportVisitor() {
        final List<Visitor> visitorList = this.visitorService.getAll();
        return visitorList;
    }
    
    @RequestMapping(value = { "/addVisitor" }, method = { RequestMethod.POST })
    @ResponseBody
    public String addStudent(@RequestBody final Visitor visitor) {
        final int v = this.visitorService.addVisitor(visitor);
        return "visitor_list";
    }
}
