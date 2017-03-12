
package com.elephorm.formation.entity.repository;

import com.elephorm.formation.entity.Film;
import java.io.FileWriter;
import java.io.IOException;


public class FileFilmDao {
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
    
    
    
}
