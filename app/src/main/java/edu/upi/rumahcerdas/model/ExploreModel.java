package edu.upi.rumahcerdas.model;

import java.io.Serializable;

/*
    todo: mungkin langsung ke explore subkategori model saja

 */

public abstract class ExploreModel implements Serializable {
    public String name;
    public int resImage;
    public String idYoutube;

    public String getIdYoutube() {
        return idYoutube;
    }

    public void setIdYoutube(String idYoutube) {
        this.idYoutube = idYoutube;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResImage() {
        return resImage;
    }

    public void setResImage(int resImage) {
        this.resImage = resImage;
    }
}
