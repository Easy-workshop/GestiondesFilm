package com.elephorm.formation.entity.repository.hibernate;


import com.elephorm.formation.entity.Film;
import com.elephorm.formation.entity.repository.FilmDaoInterface;

import com.elephorme.formation.core.util.HibernateUtil;
import java.util.List;
import javax.annotation.Resource;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.hibernate.classic.Session;
import org.springframework.stereotype.Repository;




@Repository
public class HibernateFilmDao  implements  FilmDaoInterface{

    @Resource
    private SessionFactory SessionFactory;
    
    @Override
public void save(Film film){
   
    Session session =SessionFactory.openSession();
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
    

 public Film getbyid(int  id){
   
    Session session =SessionFactory.openSession();
    Film film =null;
    
    try{
    session.beginTransaction();
    film=(Film)session.get(Film.class, id);
    Hibernate.initialize(film.getActeurPrincipal());
    Hibernate.initialize(film.getActeurSecondaires());
    
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
    return film;

    
    } 
   


 public List<Film> list(){
   
    Session session =SessionFactory.openSession();
    List<Film> films =null;
    
    try{
    session.beginTransaction();
    
    Query query=session.createQuery("from Film");
    films=query.list();
    
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
    return films;

    
    } 
 


}// fin class HibernateFilmDao
