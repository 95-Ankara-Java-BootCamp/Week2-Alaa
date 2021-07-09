
import java.util.Scanner;
public class SinemaBiletiSatis {
    public static float biletPrice = 50;
    public static String message;
    public static void main(String[] args) {
        // My Program
        //Sinema bileti satışı :
        //18 yaş altı için %10
        //18 ve 25 yaş arası %5 indirim
        // korku filmi seçilmişse ekstra %10 indirim
        int horribleFilm = 0, old, selectKindFilm;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınız giriniz:");
        old = input.nextInt();
        calculateOldIndirim(old);
        System.out.println("Eğer seçeceğini film korkuysa lütfen 1 taşlayın :");
        selectKindFilm = input.nextInt();
        if (selectKindFilm == 1) {
            biletPrice = biletPrice - biletPrice * 0.1f;
            System.out.println(message + " seçtiniz korku film için %10 indirim var Bu yüzden Biletinizin fiyatı: " + biletPrice);

        } else
            System.out.println(message +"Biletinizin fiyatı: " + biletPrice);
    }

    public static float calculateOldIndirim(int old){
        if (old <= 18){
            biletPrice = biletPrice - biletPrice * 0.1f;
            message = "Girdiniz yaş 18 yaş altı için %10 indirim var. ";
        }else if( old > 18 && old <= 25){
            biletPrice = biletPrice - biletPrice * 0.05f;
            message = "Girdiniz yaş 18 ve 25 arasında   için %5 indirim var. ";
        }else message = "Girdiniz yaş 25 üstü   için  indirim yok.  " ;

        return biletPrice;

    }
}
