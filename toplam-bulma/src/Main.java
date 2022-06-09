import java.util.Scanner;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {
        int n;
        int toplam=0;
        Scanner input = new Scanner(System.in);




        do {
            System.out.print("Sayi giriniz:");
            n = input.nextInt();
            if (n%4==0){
                toplam += n;

            }
        }while (n%2==0);

        System.out.println(toplam);
    }
}
