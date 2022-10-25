package ucuncuHafta.dataAccess.concrete.Hibernate;

import ucuncuHafta.dataAccess.abstracts.KategoriDao;
import ucuncuHafta.entities.concrete.Kategori;

public class HibernateKategoriDao implements KategoriDao {

    @Override
    public void add(Kategori kategori) {
        System.out.println("Hibernate ile kaydedildi : " + kategori.getKategoriName());

    }
}
