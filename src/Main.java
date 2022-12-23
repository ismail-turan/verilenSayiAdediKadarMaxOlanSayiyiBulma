import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz :");
        int adet=scanner.nextInt();
        double maxSayi=0;
        int baslangic=1;
        do {
            System.out.print(baslangic+". Sayı");
            int x=scanner.nextInt();
            System.out.println();
            maxSayi=Math.max(maxSayi,x);
            baslangic++;
        }while (baslangic<=adet);
        System.out.print("Girilen max sayi :"+maxSayi);
    }
}