/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elephorm.formation.entity.controller;

import com.elephorm.formation.entity.Film;
import com.elephorm.formation.entity.service.FilmService;
import java.util.Scanner;

/**
 *
 * @author HP
 */
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
    
}
