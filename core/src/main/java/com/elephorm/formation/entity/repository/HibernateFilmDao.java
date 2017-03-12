package com.elephorm.formation.entity.repository;


import com.elephorm.formation.entity.Film;

import com.elephorme.formation.core.util.HibernateUtil;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;

import org.hibernate.classic.Session;





public class HibernateFilmDao {
 
    public void save(Film film){
   
    Session session =HibernateUtil.getSessionFactory().openSession();
    try{
    session.beginTransaction();
    session.persist(film);
    session.getTransaction().commit();
    }catch(HibernateException he){
        he.printStackTrace();
        if (session.getTransaction()!=null){
        try{
        
        session.getTransaction().rollback();
        }catch (HibernateException he2){
        he2.printStackTrace();
        }
        }
    
    
    }  finally{
        if (session!=null){
        
        try{
        
        session.close();
        }catch (Exception e ){
        e.printStackTrace();
        }
        }
        }
    

    
    } 
    
}
