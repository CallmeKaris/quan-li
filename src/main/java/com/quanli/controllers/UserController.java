/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanli.controllers;

import com.quanli.pojos.User;
import com.quanli.service.UserService;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author AD
 */
@Controller

public class UserController {
    @Autowired
    private UserService userDetailsService;
   
    @GetMapping("/login")
    public String login()
    {
        return "login";
    }
    @RequestMapping("/register")
    public String registerPage(Model model)
    {
        model.addAttribute("user", new User());
        return "register";
    }
    @PostMapping("/register")
    public String register(@ModelAttribute(name ="user")User user)
    {
        userDetailsService.addUser(user);
        return "redirect:/login";
    }
    @RequestMapping("/admin/users/delete/{id}")
    public String delUser(@PathVariable(name="id")int id )
    {
        userDetailsService.delete(id);
        return "redirect:/";
    }
    
   @RequestMapping("/admin/users/edit/{id}")
    public String editpage(@PathVariable(name="id")int id, Model model)
    {
        User user = userDetailsService.getUserById(id);
        model.addAttribute("user", user);
        return "updateUsers";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute(name="user") User user){
        userDetailsService.update(user); 
        return "redirect:/";  
    }
    @RequestMapping("/admin/user")
    @Transactional
    public String qluser(Model model)
    {
        
        model.addAttribute("mess", this.userDetailsService.getAllUser());
        return "qluser";
    }
     @RequestMapping("/admin/users/profile/{id}")
    public String userProfile(@PathVariable(name="id")int id ,Model model)
    {
        User user = userDetailsService.getUserById(id);
        model.addAttribute("user", user);
        return "userprofile";
    }
    @RequestMapping("/profile/{username}")
    public String userProfileByUsername(@PathVariable(value="username") String username,Model model)
    {
        model.addAttribute("user", this.userDetailsService.getUsers(username));
        
        return "profile";
    }
}
