public class Main {

    public static void main(String[] args) {
	    String isim1 = "Ali";
	    String isim2 = "Ayşe";
	    String isim3 = "Ahmet";

	    int uzunluk1 = isim1.length();
	    int uzunluk2 = isim2.length();
	    int uzunluk3 = isim3.length();

	    if ((uzunluk1 >uzunluk2) && (uzunluk1> uzunluk3)){
	        System.out.println("En Uzun String Degeri: "+isim1);
        }
	    else if ((uzunluk2 > uzunluk1)&& (uzunluk2> uzunluk3)){
	        System.out.println("En Uzun String Degeri: "+isim2);
        }
	    else{
	        System.out.println("En Uzun String Degeri: "+isim3);
        }
    }
}
