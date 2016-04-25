package com.sourcey.materiallogindemo;

/**
 * Created by yayan on 23/04/2016.
 */
public class Matiere {
    private double tp;
    private double ds;
    private double examen;
    private double moyenne;

    public Matiere() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Matiere(double tp, double ds, double examen, double moyenne) {
        this.tp = tp;
        this.ds = ds;
        this.examen = examen;
        this.moyenne = moyenne;
    }

    public double getTp() {
        return tp;
    }



    public double getDs() {
        return ds;
    }



    public double getMoyenne() {
        return moyenne;
    }



    public double getExamen() {
        return examen;
    }


}
