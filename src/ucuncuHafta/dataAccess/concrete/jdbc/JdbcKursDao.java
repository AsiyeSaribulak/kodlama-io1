package ucuncuHafta.dataAccess.concrete.jdbc;

import ucuncuHafta.dataAccess.abstracts.KursDao;
import ucuncuHafta.entities.concrete.Kurs;

public class JdbcKursDao implements KursDao {

    public void add(Kurs kurs){
        System.out.println("Jdbc ile kaydedildi : " + kurs.getKursName());
    }
}
