// 
// 
// 

package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import com.itheima.po.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import com.itheima.util.MD5Util;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import com.itheima.po.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import com.itheima.service.AdminService;
import org.springframework.stereotype.Controller;

@Controller
public class AdminController
{
    @Autowired
    private AdminService adminService;
    
    @RequestMapping({ "/login" })
    public String login(final Admin admin, final Model model, final HttpSession session, final HttpServletRequest request) {
        admin.setA_password(MD5Util.MD5EncodeUtf8(admin.getA_password()));
        final Admin ad = this.adminService.findAdmin(admin);
        if (ad != null) {
            session.setAttribute("ad", (Object)ad);
            return "homepage";
        }
        model.addAttribute("msg", (Object)"\u7528\u6237\u540d\u6216\u5bc6\u7801\u9519\u8bef\uff0c\u8bf7\u91cd\u65b0\u767b\u5f55\uff01");
        return "login";
    }
    
    @RequestMapping({ "/loginOut" })
    public String loginOut(final Admin admin, final Model model, final HttpSession session) {
        session.invalidate();
        return "login";
    }
    
    @RequestMapping({ "/findAdmin" })
    public String findAdmin(final String a_username, final String a_describe, final Integer pageIndex, final Integer a_id, final Integer pageSize, final Model model) {
        final PageInfo<Admin> ai = this.adminService.findPageInfo(a_username, a_describe, a_id, pageIndex, pageSize);
        model.addAttribute("ai", (Object)ai);
        return "admin_list";
    }
    
    @RequestMapping(value = { "/exportadminlist" }, method = { RequestMethod.POST })
    @ResponseBody
    public List<Admin> exportAdmin() {
        final List<Admin> admin = this.adminService.getAll();
        return admin;
    }
    
    @RequestMapping(value = { "/addAdmin" }, method = { RequestMethod.POST })
    @ResponseBody
    public String addAdmin(@RequestBody final Admin admin) {
        admin.setA_password(MD5Util.MD5EncodeUtf8(admin.getA_password()));
        final int a = this.adminService.addAdmin(admin);
        return "admin_list";
    }
    
    @RequestMapping({ "/deleteAdmin" })
    @ResponseBody
    public String deleteAdmin(final Integer a_id) {
        final int a = this.adminService.deleteAdmin(a_id);
        return "admin_list";
    }
    
    @RequestMapping(value = { "/updateAdmin" }, method = { RequestMethod.POST })
    public String updateAdmin(final Admin admin) {
        admin.setA_password(MD5Util.MD5EncodeUtf8(admin.getA_password()));
        final int a = this.adminService.updateAdmin(admin);
        return "redirect:/findAdmin";
    }
    
    @RequestMapping({ "/findAdminById" })
    public String findAdminById(final Integer a_id, final HttpSession session) {
        final Admin a = this.adminService.findAdminById(a_id);
        session.setAttribute("a", (Object)a);
        return "admin_edit";
    }
}
