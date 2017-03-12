package com.elephorme.fomation.core;

//import com.elephorm.formation.entity.Film;
import com.elephorm.formation.entity.controller.DefaultFilmController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import com.elephorm.formation.entity.service.FilmService;

public class App1 {


public  static void main(String[] args)
{
    
    /*
    Film film = new Film();
    film.setTitre("ninja");
    film.setGenre("art martiaux");
    film.setNbExemplaire(200);
    
    FilmService service = new FilmService();
    service.registerFilm(film);
    
    */
   // DefaultFilmController contoller = new DefaultFilmController();
   // contoller.registerFilmFromConsoleInput();
    
ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
     DefaultFilmController controller=(DefaultFilmController)context.getBean("FilmController");
     controller.registerFilmFromConsoleInput();
} 

    
}
