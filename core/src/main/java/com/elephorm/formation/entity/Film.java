package com.elephorm.formation.entity;


public class Film {
    private Integer id;
    private String titre;
    private String genre;
    private Integer nbExemplaire;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getNbExemplaire() {
        return nbExemplaire;
    }

    public void setNbExemplaire(Integer nbExemplaire) {
        this.nbExemplaire = nbExemplaire;
    }

   
}
