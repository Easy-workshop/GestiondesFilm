
package com.elephorm.formation.entity.repository.file;

import com.elephorm.formation.entity.Film;
import com.elephorm.formation.entity.repository.FilmDaoInterface;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class FileFilmDao implements  FilmDaoInterface {
   public void save(Film film){
   
     FileWriter writer;
    try{
        writer = new FileWriter("C:\\temp\\films.txt",true);
        writer.write(film.getTitre()+";"+film.getGenre()+";"+film.getNbExemplaire()+"\n");
        writer.close();
    }catch(IOException e){
    e.printStackTrace();
    }
   
    }

    @Override
    public Film getbyid(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Film> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
