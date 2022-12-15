import java.util.Scanner;

    public class Zadanie1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Podaj liczbę całkowitą: ");
            int n=in.nextInt();
            if (n>=0) {
                printNumbers(n);
            } else {
                printNumbers(-n);
            }
        }
        public static void printNumbers(int n) {
            for (int i=0; i<=n; i++) {
                System.out.println(i);
            }
        }
    }


