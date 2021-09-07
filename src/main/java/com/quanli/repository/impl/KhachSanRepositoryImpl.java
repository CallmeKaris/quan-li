/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanli.repository.impl;

import com.quanli.pojos.KhachSan;
import com.quanli.repository.KhachSanRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

/**
 *
 * @author AD
 */
@Repository
public class KhachSanRepositoryImpl implements KhachSanRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactoryBean;
    @Override
    public List<KhachSan> getKS() {
        Session session = this.sessionFactoryBean.getObject().getCurrentSession();
        Query q = session.createQuery("From KhachSan");
        
        return q.getResultList();
    }
    
}
