/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanli.controllers;

import com.quanli.service.PhongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author AD
 */
@Controller
public class PhongController {
    @Autowired
    private PhongService phongService;
    @RequestMapping("/khachsanss")
    public String showPhong(Model model )
    {
        model.addAttribute("ks", this.phongService.getPhong());
        return "khachsan";
    }
}
