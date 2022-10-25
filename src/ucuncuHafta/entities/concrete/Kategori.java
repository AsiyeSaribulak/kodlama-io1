package ucuncuHafta.entities.concrete;

import ucuncuHafta.entities.abstracts.Entity;

public class Kategori implements Entity {
    private int id;
    private String kategoriName;

    public Kategori(int id, String kategoriName) {
        this.id = id;
        this.kategoriName = kategoriName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKategoriName() {
        return kategoriName;
    }

    public void setKategoriName(String kategoriName) {
        this.kategoriName = kategoriName;
    }
}
