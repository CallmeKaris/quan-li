/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanli.controllers;

import com.quanli.service.KhachSanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author AD
 */
@Controller
@Transactional
public class KhachSanController {
    
    @Autowired
    private KhachSanService khachSanService;
    @RequestMapping("/khachsans")
    public String showKS(Model model)
    {
        model.addAttribute("ks1", this.khachSanService.getKS());
        return "khachsan";
    
    }
        
}
