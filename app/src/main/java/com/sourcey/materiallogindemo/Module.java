package com.sourcey.materiallogindemo;

import java.util.List;

/**
 * Created by yayan on 26/04/2016.
 */
public class Module {

    private List<Matiere> matieres;

    public Module() {
    }

    public Module(List<Matiere> matieres) {
        this.matieres = matieres;
    }

    public List<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(List<Matiere> matieres) {
        this.matieres = matieres;
    }
}
