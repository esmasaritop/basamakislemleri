import java.util.Scanner;
public class BasamakIslemleri {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("lütfen bir tamsayı değeri giriniz: ");
        int sayi = giris.nextInt();

        int tekrakamlartoplamı = 0;
        int çiftrakamlartoplami = 0;
        int tekrakamlarsayisi = 0;
        int çiftrakamlarsayisi = 0;

        while (sayi != 0) {
            int basamakdegeri = sayi % 10;
            sayi = sayi / 10;

            if (basamakdegeri % 2 == 0) {
                çiftrakamlartoplami = çiftrakamlartoplami + basamakdegeri;
                çiftrakamlarsayisi++;
            } else
            {
                tekrakamlartoplamı = tekrakamlartoplamı + basamakdegeri;
                tekrakamlarsayisi++;
            }
        }
        System.out.println("girilen sayının basamak sayısı: " + (tekrakamlarsayisi + çiftrakamlarsayisi));
        System.out.println("tek rakamların toplamı: " + tekrakamlartoplamı);
        System.out.println("çift rakamlar toplamı: " + çiftrakamlartoplami);

    }
}