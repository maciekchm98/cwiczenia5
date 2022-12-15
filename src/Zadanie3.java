import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        System.out.println("Podaj jedną liczbe calkowitą: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        za8punktow(a);
    }
    public static void za8punktow(int a) {
        if (a%2==0) {
            a-=1;
        }
        int b=1;
        for (int c=0; c<a; c++) {
            if ((a-c) % 2 != 0) {
                for (int d=0; d<a-b; d++) {
                    System.out.print(" ");
                }
                b++;
                for (int e=a-c; e<=a; e++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
