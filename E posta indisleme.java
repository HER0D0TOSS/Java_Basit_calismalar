import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mail Adresi Giriniz: ");

        String mail = input.nextLine();
        int hedef = mail.indexOf("@");
        int uzunluk = mail.length();

        System.out.println(uzunluk);

        String kullaniciAdi =  mail.substring(0,hedef);
        String e_posta = mail.substring(hedef+1 ,uzunluk);

        System.out.println("Nick: " + kullaniciAdi);
        System.out.println("E-Posta: " + e_posta);
    }
}
