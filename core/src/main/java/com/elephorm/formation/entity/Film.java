package com.elephorm.formation.entity;

import java.util.Set;






public class Film {
    private Integer id;
    private String titre;
    private String genre;
    private Integer nbExemplaire;
    private Acteur acteurPrincipal;
    private Set<Acteur> acteurSecondaires;

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

    public Acteur getActeurPrincipal() {
        return acteurPrincipal;
    }

    public void setActeurPrincipal(Acteur acteurPrincipal) {
        this.acteurPrincipal = acteurPrincipal;
    }

    public Set<Acteur> getActeurSecondaires() {
        return acteurSecondaires;
    }

    public void setActeurSecondaires(Set<Acteur> acteurSecondaires) {
        this.acteurSecondaires = acteurSecondaires;
    }

   
}
