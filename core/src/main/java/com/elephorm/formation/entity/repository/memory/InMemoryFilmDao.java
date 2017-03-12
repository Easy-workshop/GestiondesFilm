/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elephorm.formation.entity.repository.memory;

import com.elephorm.formation.entity.Film;
import com.elephorm.formation.entity.repository.FilmDaoInterface;
import java.util.List;

/**
 *
 * @author HP
 */
public class InMemoryFilmDao implements FilmDaoInterface{

private List<Film> films;

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

   

@Override
    public void save(Film film) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Film getbyid(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Film> list() {
        return films;
    }

    
    
}
