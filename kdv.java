import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double para;
        double kdvTutar = 0.18;
        System.out.print("Para degerini giriniz: ");

        para = scan.nextDouble();

        kdvTutar = (para < 1000)? 0.18 : 0.08;

        System.out.println("KDV'siz tutar = "+para);
        System.out.println("KDV oranı = "+ kdvTutar);
        System.out.println("KDV'li tutar = "+ (para + (para*kdvTutar)));

    }
}
