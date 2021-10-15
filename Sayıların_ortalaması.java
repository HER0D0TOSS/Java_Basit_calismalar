import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("SAYI GİRİNİZ: ");

        int sayım =input.nextInt();
        int toplam = 0;
        int adet = 0;

        while (sayım>=0){
            toplam +=sayım;
            adet +=1;
            sayım = input.nextInt();
        }System.out.println("Sayıların Ortalaması: "+toplam/adet);
    }
}
