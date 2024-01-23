public class project7 {
    import java.util.Scanner;

    public class SayisalOranBulma {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Kullanıcıdan iki sayıyı al
            System.out.print("İlk sayıyı girin: ");
            double sayi1 = scanner.nextDouble();

            System.out.print("İkinci sayıyı girin: ");
            double sayi2 = scanner.nextDouble();

            // Oranı hesapla
            double oran = sayi1 / sayi2;

            // Sonucu ekrana yazdır
            System.out.println("Sayısal Oran: " + oran);

            // Scanner'ı kapat
            scanner.close();
        }
    }

}
