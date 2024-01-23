public class project14 {
    import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

    public class TarihFarkiHesaplama {

        public static void main(String[] args) {
            // İki tarihi oluştur
            LocalDate tarih1 = LocalDate.of(2022, 1, 1);
            LocalDate tarih2 = LocalDate.now(); // Şu anki tarih

            // Tarih farkını hesapla
            long gunFarki = ChronoUnit.DAYS.between(tarih1, tarih2);

            // Sonucu ekrana yazdır
            System.out.println("Tarih Farkı: " + gunFarki + " gün");
        }
    }

}
