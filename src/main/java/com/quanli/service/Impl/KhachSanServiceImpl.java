/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanli.service.Impl;

import com.quanli.pojos.KhachSan;
import com.quanli.repository.KhachSanRepository;
import com.quanli.service.KhachSanService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author AD
 */
@Service
public class KhachSanServiceImpl implements KhachSanService{

    @Autowired
    private KhachSanRepository khachSanRepository;
    @Override
    public List<KhachSan> getKS() {
        return this.khachSanRepository.getKS();
    }
    
}
