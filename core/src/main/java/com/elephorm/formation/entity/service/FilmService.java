

package com.elephorm.formation.entity.service;

import com.elephorm.formation.entity.Film;
import com.elephorm.formation.entity.repository.file.FileFilmDao;
import com.elephorm.formation.entity.repository.FilmDaoInterface;
import com.elephorm.formation.entity.repository.hibernate.HibernateFilmDao;
import com.elephorm.formation.entity.repository.jdbc.JdbcFilmDao;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class FilmService  implements FilmServiceInterface{
   
    @Resource
    private FilmDaoInterface dao; 

   public FilmService(){
   
   }
   public FilmService(FilmDaoInterface dao){
   this.dao=dao;
   }
   
    public FilmDaoInterface getDao() {
        return dao;
    }

    public void setDao(FilmDaoInterface dao) {
        this.dao = dao;
    }
    
public void registerFilm(Film film){
    //System.out.println("film enregistré");
    /*
    FileFilmDao dao=new FileFilmDao();
    dao.save(film);
    
*/
 /* 
  JdbcFilmDao dao=new JdbcFilmDao();
  dao.save(film);
*/
dao.save(film);
}
 
public Film getFilmDescription(int id){
    return dao.getbyid(id);
    }
public List<Film> getListFilms(){
    return dao.list() ;
}   


}
