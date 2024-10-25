package org.example;


import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class HelloImpl implements Hello{
    @PersistenceContext(unitName = "myUnit")
    private EntityManager entityManager;


    @Override
    public String sayHello(String msg) {
        return "this is hello world" + msg;
    }
}
