import java.util.*;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yaricap Giriniz: ");

        float yaricap = input.nextInt();
        double pi = 3.14;

        double  Alan = pi * yaricap*yaricap;
        System.out.println("Dairenin Alanı: "+ Alan + " Metre Kare");

        double Cevre = 2 * pi * yaricap;
        System.out.println("Dairenin Cevresi: "+ Cevre + " Metre ");
    }
}
