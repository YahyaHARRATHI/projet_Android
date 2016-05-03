package com.sourcey.materiallogindemo;

/**
 * Created by yayan on 23/04/2016.
 */
public class Matiere {
    private double tp;
    private double ds;
    private double examen;
    private double moyenneMatiere;
    private String libelle;

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Matiere() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Matiere(double tp, double ds, double examen, double moyenne,String libelle) {
        this.tp = tp;
        this.ds = ds;
        this.examen = examen;
        this.moyenneMatiere = moyenne;
        this.libelle=libelle;
    }

    public double getTp() {
        return tp;
    }



    public double getDs() {
        return ds;
    }



    public double getMoyenneMatiere() {
        return moyenneMatiere;
    }



    public double getExamen() {
        return examen;
    }


}
