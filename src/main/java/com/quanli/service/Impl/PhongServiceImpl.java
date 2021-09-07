/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanli.service.Impl;

import com.quanli.pojos.Phong;
import com.quanli.repository.PhongRepository;
import com.quanli.service.PhongService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author AD
 */
@Service
public class PhongServiceImpl implements PhongService{

    @Autowired
    private PhongRepository phongRepository;
    @Override
    public List<Phong> getPhong() {
        return this.phongRepository.getPhong();
    }
    
}
