import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x, y, z;
        System.out.println("Podaj po kolei liczby calkowite, które nie ujemne.");
        do {
            System.out.println("x: ");
            x=scanner.nextInt();
            System.out.println("y: ");
            y=scanner.nextInt();
            System.out.println("z: ");
            z=scanner.nextInt();
        }
        while (x<0 | y<0 | z<0);
        liczby(x, y, z);
    }
    public static void liczby(int x, int y, int z) {

        for (int n=0; n<x | n<y | n<z; n++) {
            if (x<y | x<z) {
                System.out.print("  ");
                x+=1;
            }else {
                System.out.print("* ");
            }
            if (y<x | y<z){
                System.out.print("  ");
                y+=1;
            }else {
                System.out.print("* ");
            }
            if (z<x | z<y){
                System.out.print("  ");
                z+=1;
            }else {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}