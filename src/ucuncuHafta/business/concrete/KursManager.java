package ucuncuHafta.business.concrete;

import ucuncuHafta.business.abstracts.KursService;
import ucuncuHafta.core.Logger;
import ucuncuHafta.dataAccess.abstracts.KursDao;
import ucuncuHafta.entities.concrete.Kurs;

public class KursManager implements KursService {

    private KursDao kursDao;
    private Logger logger;

    public KursManager(KursDao kursDao,Logger logger) {
        this.kursDao = kursDao;
        this.logger=logger;
    }

    @Override
    public void add(Kurs kurs) {
        kursDao.add(kurs);
        logger.log(kurs.getKursName());
    }
}
