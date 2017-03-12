package com.elephorm.formation.entity.controller;

import com.elephorm.formation.entity.Film;
import com.elephorm.formation.entity.service.FilmService;
import java.util.Scanner;

public class DefaultFilmController {
    
    public void registerFilmFromConsoleInput (){
    Scanner sc=new Scanner(System.in);
    System.out.println("titre=");
    String titre= sc.nextLine();
    System.out.println("genre=");
    String genre= sc.nextLine();
    System.out.println("nbexemplaire=");
    int nb= sc.nextInt();



Film film=new Film();
film.setTitre(titre);
film.setGenre(genre);
film.setNbExemplaire(nb);

FilmService service = new FilmService();
service.registerFilm(film);

        


    }
    
public void descrireFilmwithCconsole()
{

 Scanner sc=new Scanner(System.in);
    System.out.println("donner ID du film=");
   int id = sc.nextInt();
    
    FilmService service =new FilmService();
    Film film =service.getFilmDescription(id);
    System.out.println("le film est "+film.getTitre()+"--"+film.getGenre());
        System.out.println("++++l'acteur "+film.getActeurPrincipal().getPrenom());

}
}


