

package com.elephorm.formation.entity.service;

import com.elephorm.formation.entity.Film;
import com.elephorm.formation.entity.repository.FileFilmDao;
import com.elephorm.formation.entity.repository.FilmDaoInterface;
import com.elephorm.formation.entity.repository.HibernateFilmDao;
import com.elephorm.formation.entity.repository.JdbcFilmDao;
import java.util.List;


public class FilmService  implements FilmServiceInterface{
   private FilmDaoInterface dao; 

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
