public class project19 {
    import java.util.ArrayList;
import java.util.List;

    class Urun {
        private String ad;
        private double fiyat;

        public Urun(String ad, double fiyat) {
            this.ad = ad;
            this.fiyat = fiyat;
        }

        public String getAd() {
            return ad;
        }

        public double getFiyat() {
            return fiyat;
        }

        @Override
        public String toString() {
            return ad + " - " + fiyat + " TL";
        }
    }

    class Pazaryeri {
        private List<Urun> urunler;

        public Pazaryeri() {
            this.urunler = new ArrayList<>();
        }

        public void urunEkle(Urun urun) {
            urunler.add(urun);
            System.out.println(urun.getAd() + " pazaryerine eklendi.");
        }

        public void urunleriListele() {
            System.out.println("Pazaryerindeki Ürünler:");
            for (Urun urun : urunler) {
                System.out.println(urun);
            }
        }
    }

    public class PazaryeriUygulamasi {
        public static void main(String[] args) {
            Pazaryeri pazaryeri = new Pazaryeri();

            Urun elma = new Urun("Elma", 2.5);
            Urun ekmek = new Urun("Ekmek", 1.5);

            pazaryeri.urunEkle(elma);
            pazaryeri.urunEkle(ekmek);

            pazaryeri.urunleriListele();
        }
    }

}
