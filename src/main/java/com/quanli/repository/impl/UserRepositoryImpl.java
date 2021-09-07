/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanli.repository.impl;

import com.quanli.pojos.User;
import com.quanli.repository.UserRepository;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author AD
 */
@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository{
     @Autowired
    private LocalSessionFactoryBean sessionFactory;
    @Override
    public List<User> getUsers(String username) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
          CriteriaBuilder builder = session.getCriteriaBuilder();
          CriteriaQuery<User> query= builder.createQuery(User.class);
          Root root = query.from(User.class);
          query = query.select(root);
          if(!username.isEmpty())
          {
              Predicate p = builder.equal(root.get("username").as(String.class), username.trim());
              query = query.where(p);
          }
          Query q = session.createQuery(query);
          return q.getResultList();
    }

    @Override
    public void addUser(User user) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
       
        session.save(user);
    }

    @Override
    public void update(User user) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        session.update(user);
    }

    @Override
    public void delete(int id) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        User user = (User)session.get(User.class, id);
        session.delete(user);
    }

    @Override
    public User getUserById(int id) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
       User user = (User)session.get(User.class, id);
       return user;
    }

    @Override
    public List<User> getAllUser() {
       Session s = sessionFactory.getObject().getCurrentSession();
       Query q = s.createQuery("From User");
       
       return q.getResultList();
    }

    
    
}
