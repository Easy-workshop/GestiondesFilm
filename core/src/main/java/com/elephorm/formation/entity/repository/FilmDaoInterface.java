
package com.elephorm.formation.entity.repository;

import com.elephorm.formation.entity.Film;
import java.util.List;


public interface FilmDaoInterface {
public void save(Film film);
public Film getbyid(int  id);
            
public List<Film> list();
}
