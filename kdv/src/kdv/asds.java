package kdv;
import java.util.Scanner;
public class asds {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan fiyatı al
        System.out.print("Lütfen para değerini giriniz: ");
        double fiyat = scanner.nextDouble();

        // KDV oranını belirle
        double kdvOrani = (fiyat > 1000) ? 0.08 : 0.18;

        // KDV tutarını hesapla
        double kdvTutari = fiyat * kdvOrani;

        // KDV'li fiyatı hesapla
        double kdvliFiyat = fiyat + kdvTutari;

        // Sonuçları ekrana yazdır
        System.out.println("KDV'siz Fiyat: " + fiyat);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV Tutarı: " + kdvTutari);
    }

}
