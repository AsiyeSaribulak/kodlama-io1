import ucuncuHafta.business.concrete.EgitmenManager;
import ucuncuHafta.business.concrete.KategoriManager;
import ucuncuHafta.business.concrete.KursManager;
import ucuncuHafta.core.DataBaseLogger;
import ucuncuHafta.core.EmailLogger;
import ucuncuHafta.core.FileLogger;
import ucuncuHafta.dataAccess.concrete.Hibernate.HibernateKategoriDao;
import ucuncuHafta.dataAccess.concrete.jdbc.JdbcEgitimenDao;
import ucuncuHafta.dataAccess.concrete.jdbc.JdbcKursDao;
import ucuncuHafta.entities.concrete.Egitmen;
import ucuncuHafta.entities.concrete.Kategori;
import ucuncuHafta.entities.concrete.Kurs;

public class Main {
    public static void main(String[] args) {
        Egitmen egitmen=new Egitmen(1,"Asiye","SARIBULAK");
        EgitmenManager egitmenManager=new EgitmenManager(new JdbcEgitimenDao(), new EmailLogger());
        egitmenManager.add(egitmen);

        Kategori kategori=new Kategori(1,"backend");
        KategoriManager kategoriManager=new KategoriManager(new HibernateKategoriDao(),new FileLogger());
        kategoriManager.add(kategori);

        Kurs kurs=new Kurs(1,"Java");
        KursManager kursManager=new KursManager(new JdbcKursDao(),new DataBaseLogger());
        kursManager.add(kurs);
    }
}