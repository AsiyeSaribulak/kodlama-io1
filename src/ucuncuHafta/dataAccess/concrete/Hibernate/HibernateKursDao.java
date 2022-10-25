package ucuncuHafta.dataAccess.concrete.Hibernate;

import ucuncuHafta.dataAccess.abstracts.KursDao;
import ucuncuHafta.entities.concrete.Kurs;

public class HibernateKursDao implements KursDao {
    @Override
    public void add(Kurs kurs) {
        System.out.println("Hibernate ile kaydedildi : " + kurs.getKursName());

    }
}
