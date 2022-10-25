package ucuncuHafta.dataAccess.concrete.Hibernate;

import ucuncuHafta.dataAccess.abstracts.EgitmenDao;
import ucuncuHafta.entities.concrete.Egitmen;

public class HibernateEgitmenDao implements EgitmenDao {

    @Override
    public void add(Egitmen egitmen) {
        System.out.println("Hibernate ile kaydedildi : " + egitmen.getFirstName() + egitmen.getLastName());
    }
}
