package KopyaBaskaYer.JavaProjectsFaDu.P11_depoYonetimiTur;


import static JavaProjectsFaDu.P11_depoYonetimiTur.Islemler.depoYonetimSistemi;
import static JavaProjectsFaDu.P11_depoYonetimiTur.Islemler.scan;

public class HataKontrol {


    // Yeni Urun Ekleme - kac tane urun ekleyeceksiniz kontrolu?

    public static int eklenecekUrunSayisi() {

        int tempNum = 0;

        while (true) {
            try {
                System.out.print("Kac tane urun ekleyeceksiniz : ");
                tempNum = scan.nextInt();
                if (tempNum < 0 || tempNum > 10) {  // en fazla 10 urun en az 0 urun eklenebilir
                    throw new IllegalArgumentException();
                } else {
                    break;
                }

            } catch (IllegalArgumentException e) {
                System.out.println("UYARI ! : her eklemede maksimu 10 urun ekleyebilirsiniz");

            } catch (Exception e) {   // baska bir exception olusursa
                String str = scan.next();
                System.out.println("UYARI ! Lutfen 1 den 10 a kadar sayisal bir deger giriniz");

            }
        }

        return tempNum;
    }


    // Urun Kodu Kontrolu
    public static int urunKoduSec() {
        int tempNum = 0;

        while (true) {
            try {
                System.out.print("Lutfen urun kodunu giriniz : ");
                tempNum = scan.nextInt();


                if (!Urunler.eklnenUrunlerMap.keySet().contains(tempNum)) {
                    throw new IllegalArgumentException();
                } else {
                    break;
                }

            } catch (IllegalArgumentException e) {
                System.out.println("UYARI ! : Lutfen kayitli urunlerden birini giriniz");

            } catch (Exception e) {
                String str = scan.next();
                System.out.println("UYARI ! Lutfen dogru urun kodu giriniz");

            }
        }

        return tempNum;
    }

    // Miktar Kontrolu
    public static int urunMiktarGir() {
        int tempNum = 0;

        while (true) {
            try {
                System.out.print("Lutfen urun miktariniz giriniz (max 100 birim): ");
                tempNum = Integer.valueOf(scan.next());

                if (tempNum < 0 || tempNum > 100) {
                    throw new IllegalArgumentException();
                } else {
                    break;
                }

            } catch (IllegalArgumentException e) {
                System.out.println("UYARI ! : her urun icin max 100 birim miktar girebilirsiniz");

            } catch (Exception e) {
                System.out.println("UYARI ! Lutfen sayisal bir veri giriniz");

            }
        }

        return tempNum;
    }


    // Raf Planlama  icin - urun kodundan miktari al
    public static int rafIcinUrunKodundanMiktariAl(int productId) {
        int tempQuantity = 0;

        Urunler urunObje = Urunler.eklnenUrunlerMap.get(productId);
        return urunObje.getUrunMiktar();

    }



    // Raf Planlama icin secilen urunun miktari 0 ise
    public static int secilanUrunKoduMiktarSifir() {
        int tempNum = 0;

        while (true) {
            try {
                System.out.print("1: farkli urunu rafa ata\t2: Ana menuye geri don : ");
                tempNum = Integer.valueOf(scan.next());

                if (tempNum < 0 || tempNum > 2) {
                    throw new IllegalArgumentException();
                } else {
                    break;
                }

            } catch (IllegalArgumentException e) {
                System.out.println("UYARI ! : baska urun raf atamasi icin 1 " +
                        "\n anamenu icin 2 yi seciniz");

            } catch (Exception e) {
                System.out.println("UYARI ! Lutfen menuden seciminizi yapiniz");

            }
        }

        return tempNum;
    }

    // secimmethodu kontrol
    public static int secimMethoduKontrolu() {
        int tempNum = 0;

        while (true) {
            try {
                System.out.print("1: Ana menu\t2: Cikis  -> : ");
                tempNum = Integer.valueOf(scan.next());

                if (tempNum < 0 || tempNum > 2) {
                    throw new IllegalArgumentException();
                } else {
                    break;
                }

            } catch (IllegalArgumentException e) {
                System.out.println("UYARI ! : Anamenuye donmek icin 1 " +
                        "\n Cikis icin 2 yi seciniz");

            } catch (Exception e) {
                System.out.println("UYARI ! Lutfen menuden seciminizi yapiniz");

            }
        }

        return tempNum;
    }

    public static int urunCikisMiktarKontrol(int gelenUrunKodu) {
        int tempNum = 0;
        int sayac=0;

        while (true) {
            try {
                System.out.print("Lutfen urun miktariniz giriniz: ");
                tempNum = Integer.valueOf(scan.next());
                // Urunler obje= Urunler.eklnenUrunlerMap.get(gelenUrunKodu);

                if (tempNum > Urunler.eklnenUrunlerMap.get(gelenUrunKodu).getUrunMiktar()) {
                    throw new IllegalArgumentException();
                } else {
                    break;
                }

            } catch (IllegalArgumentException e) {
                System.out.println("UYARI ! : Girilen miktar rafdakinden fazladir");
                sayac++;

            } catch (Exception e) {
                System.out.println("UYARI ! Lutfen sayisal bir veri giriniz");
                sayac++;

            }

            if(sayac==3) {
                System.out.println("3 kere hatali giris yaptiniz");
                depoYonetimSistemi();

            }
        }

        return tempNum;

    }
}
