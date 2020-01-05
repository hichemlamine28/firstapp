/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.firstapp.Model;

/**
 *
 * @author Hichem
 */
public class Globe {
 private String astre,titre;
 private double superficie;
 private int continent;

    public String getAstre() {
        return astre;
    }

    public void setAstre(String astre) {
        this.astre = astre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getContinent() {
        return continent;
    }

    public void setContinent(int continent) {
        this.continent = continent;
    }

    public Globe(String astre, String titre, double superficie, int continent) {
        this.astre = astre;
        this.titre = titre;
        this.superficie = superficie;
        this.continent = continent;
    }
 
 
 
 
}
