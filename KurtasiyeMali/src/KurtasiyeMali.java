import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//      Bir kırtasiye dükkanına mal geliyor.
//      Kırtasiyeci kalem, silgi gibi malzemelerin kaydını sisteme girecek.
//         * soru 1: Toplam kaç adet mal aldı.
//         * soru 2: Hangi maldan kaç adet aldı.
//         * soru 3: Kaç çeşit malı var.

public class KurtasiyeMali {
    public static void main(String[] args) {
        List<Subject> subject = new ArrayList<>();
        String testsayi;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Lütfen mal ismi giriniz:");
            String isim = input.nextLine();
            System.out.println("Lütfen mal sayısı giriniz:");
            int sayi = input.nextInt();
            subject.add(new Subject(isim, sayi));
            System.out.println("eğer bir daha mal eklemek istersen 1 basınız yoksa Enter!");
//input.hasNext() &&
            testsayi = input.next();
        } while (testsayi.equals("1"));

        int toplam = 0;
        //   int deger;
        for (Subject item : subject) {
            //   deger = item.sayi;
            //   System.out.println(deger);
            //  toplam = toplam + item.;
            toplam = toplam + item.sayi;
//            System.out.print(item.isim + " ---> ");
//             System.out.println(item.sayi);
        }
        System.out.println("1. Toplam kaç adet mal aldı:   " + toplam);
        System.out.print("2.Mal Adı" + " ---> ");
        System.out.println("Mal sayısı");
        for (Subject item : subject) {

            System.out.print(item.isim + "        ---> ");
            System.out.println(item.sayi);
        }
        int i = 0, allSayi;
      // List<String> searchItem1 = new ArrayList<String>();


        List<String> searchItem = new ArrayList<String>();
        for (Subject findItem : subject) {
            if (!searchItem.contains(findItem.isim)) {
                searchItem.add(findItem.isim);
              //  System.out.println(findItem.isim);
            }
        }
        System.out.println("3.Kaç çeşit malı var:" + searchItem.size());

        for (String findItem1 : searchItem) {
            System.out.println(findItem1);
        }
    }
}
