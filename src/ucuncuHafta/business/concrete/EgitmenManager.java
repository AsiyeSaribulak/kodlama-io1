package ucuncuHafta.business.concrete;

import ucuncuHafta.core.Logger;
import ucuncuHafta.dataAccess.abstracts.EgitmenDao;
import ucuncuHafta.entities.concrete.Egitmen;

public class EgitmenManager {
    private EgitmenDao egitmenDao;
    private Logger logger;

    public EgitmenManager(EgitmenDao egitmenDao,Logger logger){
        this.egitmenDao=egitmenDao;
        this.logger=logger;
    }
    public void add(Egitmen egitmen){
        egitmenDao.add(egitmen);
        logger.log(egitmen.getFirstName());
    }
}
