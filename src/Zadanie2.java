import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe całkowitą: ");
        Scanner scanner = new Scanner(System.in);
        int an = scanner.nextInt();
        System.out.println(Ciag(an));
    }
    public static long Ciag(int n){
        if (n==1){
            return 1;
        }
        if (n==0){
            return 0;
        }
        long a0=0;
        long a1=1;
        int i=2;

        while (i<n){
            long nextN=a0+a1;
            a0=a1;
            a1=nextN;
            i++;
        }
        return a1;
    }
}