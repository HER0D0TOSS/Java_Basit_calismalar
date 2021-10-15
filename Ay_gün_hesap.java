import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yılın Kaçıncı Ayındayız? ");

        int Ay = input.nextInt();

        Dictionary<Integer, String> sozluk = new Hashtable<>();
        sozluk.put(1,"OCAK");
        sozluk.put(2,"ŞUBAT");
        sozluk.put(3,"MART");
        sozluk.put(4,"NİSAN");
        sozluk.put(5,"MAYIS");
        sozluk.put(6,"HAZİRAN");
        sozluk.put(7,"TEMMUZ");
        sozluk.put(8,"AĞUSTOS");
        sozluk.put(9,"EYLÜL");
        sozluk.put(10,"EKİM");
        sozluk.put(11,"KASIM");
        sozluk.put(12,"ARALIK");

        System.out.println("YILIN "+ sozluk.get(Ay)+" AYINDAYIZ");
    }
}
