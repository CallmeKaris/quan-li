/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanli.service.Impl;

import com.quanli.pojos.User;
import com.quanli.repository.UserRepository;
import com.quanli.service.UserService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author AD
 */
@Service("userDetailsService")
public class UserServiceImpl implements  UserService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Override
    public List<User> getUsers(String username) {
       return this.userRepository.getUsers(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<User> users = this.getUsers(username);
       if(users.isEmpty())
       {
           throw new UsernameNotFoundException ("khong tim thay user");
       }
       User user = users.get(0);
       Set<GrantedAuthority> auth = new HashSet<>();
       auth.add(new SimpleGrantedAuthority(user.getUserRole()));
       return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),auth);
    }

    @Override
    public void addUser(User user) {
       String pass = user.getPassword();
       user.setPassword(this.passwordEncoder.encode(pass));
       user.setUserRole(user.USER);
       userRepository.addUser(user);
    }

    @Override
    public void update(User user) {
        String pass = user.getPassword();
       user.setPassword(this.passwordEncoder.encode(pass));
       user.setUserRole(user.USER);
       userRepository.addUser(user);
    }

    @Override
    public void delete(int i) {
        this.userRepository.delete(i);
    }

    @Override
    public User getUserById(int i) {
       return this.userRepository.getUserById(i);
    }

    @Override
    public List<User> getAllUser() {
        return this.userRepository.getAllUser();
    }

    
    
}
