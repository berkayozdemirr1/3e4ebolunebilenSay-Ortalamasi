import java.util.Scanner; /****** SCANNER SINIFI OLUSTURDUM ******/

public class Main {
    public static void main(String[] args) {
        int sayi, sayiAdedi = 0, toplam = 0, ortalama, i; /** SAYI SAYI ADEDİ TOPLAM VE ORTALAMA DEGİSKENLERİNİ TANIMLADIM
                                                              VE SAYI ADEDİNİN VE TOPLAMIN SIFIRDAN BAŞLAMASINI SÖYLEDİM **/


        Scanner deger = new Scanner(System.in);
        System.out.print("Sayi Belirleyiniz : ");
        sayi = deger.nextInt();                           /** KULLANICIDAN DEGER ALABİLECEĞİM BİR YAPI OLUŞTURDUM VE BUNU
                                                              SAYI OLARAK TANIMLADIM **/

        for (i = 1; i <= sayi; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                sayiAdedi++;                              /** BURADA FOR VE İF İLE 3E 4E BÖLÜNEBİLME ŞARTI İSTEDİĞİMİ SÖYLEDİM
                                                              VE HER DÖNGÜDE BULDUĞU DEĞERİ BİR ÖNCEKİYLE TOPLAMASINI VE ADEDİ
                                                              1 ARTTIRMASINI SÖYLEDİM. **/
            }
        }
        ortalama = toplam / sayiAdedi;
        System.out.println("3'e ve 4'e tam bolunebilen sayilarin ortalamasi : " + ortalama);
    }           /** SON OLARAK ORTALAMANIN FORMULUNU YAZDIM VE EKRANA ÇIKTI VERDİM **/
}
