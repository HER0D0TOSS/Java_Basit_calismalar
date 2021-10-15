public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Karakter Giriniz: ");

    char karakterim = input.next().charAt(0);
   // System.out.println(karakterim);

    char karakterim_kucuk = Character.toLowerCase(karakterim);

    if(karakterim != karakterim_kucuk){
        System.out.println("Lütfen Küçük Karakter giriniz");
    }
    else {
        System.out.println("Girilen  Küçük Karakter : "+ karakterim);
        char cUp= Character.toUpperCase(karakterim);
        System.out.println("Girilen karakterin büyük harf karşılığı: "+ cUp);
    }

    }
}
