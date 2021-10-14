import java.util.*;
public class Main {
/* klavye girişi ile %18 kdv hesabı yapar */
    public static void main(String[] args) {

        Scanner deger = new Scanner(System.in);
        System.out.println("Kdv'si alınacak degeri giriniz: ");

        int a = deger.nextInt();
        System.out.println("Girilen Deger:  " + a);

        float hesap = (a*18)/100;
        System.out.println("KDV:"+ hesap +" TL");

        float Kdv = hesap;

        float hesap2= a +Kdv;

        System.out.println("Ürünün Kdv'Li Değeri: "+hesap2 + "TL");

    }

}
