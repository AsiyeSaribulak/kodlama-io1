package ucuncuHafta.dataAccess.concrete.jdbc;

import ucuncuHafta.dataAccess.abstracts.KategoriDao;
import ucuncuHafta.entities.concrete.Kategori;

public class JdbcKategoriDao implements KategoriDao {

    @Override
    public void add(Kategori kategori) {
        System.out.println("Jdbc ile kaydedildi : " + kategori.getKategoriName());

    }
}
