package ucuncuHafta.business.concrete;

import ucuncuHafta.business.abstracts.KategoriService;
import ucuncuHafta.core.Logger;
import ucuncuHafta.dataAccess.abstracts.KategoriDao;
import ucuncuHafta.entities.concrete.Kategori;

public class KategoriManager implements KategoriService {
    private KategoriDao kategoriDao;
    private Logger logger;

    public KategoriManager(KategoriDao kategoriDao, Logger logger) {
        this.kategoriDao = kategoriDao;
        this.logger = logger;
    }

    @Override
    public void add(Kategori kategori) {
        kategoriDao.add(kategori);
        logger.log(kategori.getKategoriName());
    }
}
