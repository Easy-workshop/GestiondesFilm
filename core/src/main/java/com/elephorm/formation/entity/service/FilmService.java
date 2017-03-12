

package com.elephorm.formation.entity.service;

import com.elephorm.formation.entity.Film;
import com.elephorm.formation.entity.repository.FileFilmDao;
import com.elephorm.formation.entity.repository.HibernateFilmDao;
import com.elephorm.formation.entity.repository.JdbcFilmDao;


public class FilmService {
   
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

  HibernateFilmDao dao =new HibernateFilmDao();
  dao.save(film);

}
    
}
