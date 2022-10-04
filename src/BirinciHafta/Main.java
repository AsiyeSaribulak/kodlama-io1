public class Main {
    public static void main(String[] args) {
              /* VARİABLE
        int sayi=10;
        String mesaj="öğrenci sayısı: ";
        System.out.println(mesaj +sayi);
        System.out.println("öğrenci sayım:"+sayi);
        System.out.println("öğrenci sayım:"+sayi);
        System.out.println("öğrenci sayım:"+sayi);*/

                 //ŞART BLOKLARI//
        /*int sayi=10;
        if(sayi<20)
        { System.out.println("sayi 20 en küçüktür.");
        } else if (sayi==20) {
            System.out.println("sayı 20 e eşittir");
        }else {
            System.out.println("sayı 20 den büyüktür");
        }*/

        /*int sayi1=20;
        int sayi2=25;
        int sayi3=2;
        int eb=sayi1;
        if (eb<sayi2){
            System.out.println("en büyük sayi: "+sayi2);
        } else if (eb<sayi3) {
            System.out.println("en büyük sayi: "+sayi3);
        }else {
            System.out.println("en büyük sayi: "+sayi1);
        }*/

              //SWİTCH
       /* char grade='C';
        switch (grade){
            case 'A':
                System.out.println("Mükemmel: geçtiniz");
                break;
            case 'B':
                System.out.println("Çok güzel: geçtiniz");
                break;
            case 'C':
                System.out.println("iyi: geçtiniz");
                break;
            case 'D':
                System.out.println("fena değil: geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }*/

              //DÖNGÜLER
        // for (int i=1;i<10;i+=2){
        //   System.out.println(i);
        /*int i=1;
        while(i<10){
            System.out.println(i);
            i++;
        }*/
       /* int j=40;
        do {
            System.out.println(j);
            j++;
        }while (j>41);*/

             // Diziler
       /* String[] sehir=new String[3];
        sehir[0]="ankara";
        sehir[1]="bilecik";
        sehir[2]="van";

        for(int i=0;i< sehir.length;i++){
            System.out.println(sehir[i]);
        }
        System.out.println("*******");
        for (String sehirler:sehir){
            System.out.println(sehirler);
        }

        double[] list = {1.2, 1.3, 1.5, 2.4};
        double toplam = 0.0;
        double max = list[0];
        for (double number : list) {
            if (max < number) {
                max = number;
            }
            System.out.println(number);
            toplam += number;
        }
        System.out.println("toplam : " + toplam);
        System.out.println("max: " + max);

             //ÇOK BOYUTLU DİZİLER
        String[][] sehirler=new String[3][3];
        sehirler[0][0]="istanbul";
        sehirler[0][1]="düzce";
        sehirler[0][2]="bursa";
        sehirler[1][0]="van";
        sehirler[1][1]="ağrı";
        sehirler[1][2]="bitlis";
        sehirler[2][0]="hatay";
        sehirler[2][1]="antalya";
        sehirler[2][2]="osmaniye";

        for (int i=0;i< sehirler.length;i++){
            System.out.println("----------");
            for (int j=0;j< sehirler.length;j++)
                System.out.println(sehirler[i][j]);
        }*/

              //STRİNGLER
       /* String mesaj="Bugün hava çok güzel";
        System.out.println(mesaj);
        System.out.println("4.eleman:"+mesaj.charAt(3));
        System.out.println(mesaj.concat(" yuppiii!"));
        char[] karakterler=new char[5];
        mesaj.getChars(0,2,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));*/

               //ASAL SAYI
      /*  int number = 2;
        int reminder = number % 2;
        boolean isPrime=true;

        if(number==1){
            System.out.println("sayı asal değildir.");
            return;
        }
        if(number<1) {
            System.out.println("geçersiz sayı");
        }
            for (int i = 2; i < number; i++) {
                if (number % 2 == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("sayı asaldır:" + number);
            } else {
                System.out.println("sayı asal değil:" + number);
            }*/

                  //KALIN SESLİ VE İNCE SESLİ  HARF
   /*     char harf='E';
        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }*/

       /* //MÜKEMMEL SAYI
        int number=6;
        int toplam=0;
        for (int i=1;i<number;i++){
            if(number%i==0){
                toplam+=i;
            }
        }
        if(number==toplam){
            System.out.println("mükemmel sayıdır");
        }else{
            System.out.println("mükemmel sayı değildir");
        }*/

    }
}
