package ucuncuHafta.dataAccess.concrete.jdbc;

import ucuncuHafta.dataAccess.abstracts.EgitmenDao;
import ucuncuHafta.entities.concrete.Egitmen;

public class JdbcEgitimenDao implements EgitmenDao {
    @Override
    public void add(Egitmen egitmen) {
        System.out.println("Jdbc ile kaydedildi : " + egitmen.getFirstName() + egitmen.getLastName());

    }


}
