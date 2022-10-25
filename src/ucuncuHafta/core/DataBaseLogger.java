package ucuncuHafta.core;

public class DataBaseLogger implements Logger{
    public void log(String data) {
        System.out.println("Veritabanına loglandı: " +data);
    }
}
