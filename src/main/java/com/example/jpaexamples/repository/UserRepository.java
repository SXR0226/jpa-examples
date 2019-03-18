package com.example.jpaexamples.repository;

import com.example.jpaexamples.examples01.entity.Address;
import com.example.jpaexamples.examples01.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class UserRepository {
    @PersistenceContext
    private EntityManager em;
    public void addUserAddress(){
        User u1=new User("BO");
        em.persist(u1);
        Address address1=new Address("999");
        address1.setUser(u1);
        em.persist(address1);

        Address address2=new Address("666");
        address2.setUser(u1);
        em.persist(address2);
    }

}
