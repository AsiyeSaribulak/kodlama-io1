package ucuncuHafta.entities.concrete;

import ucuncuHafta.entities.abstracts.Entity;

public class Kurs implements Entity {
    private int id;
    private String kursName;

    public Kurs(int id, String kursName) {
        this.id = id;
        this.kursName = kursName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKursName() {
        return kursName;
    }

    public void setKursName(String kursName) {
        this.kursName = kursName;
    }
}
