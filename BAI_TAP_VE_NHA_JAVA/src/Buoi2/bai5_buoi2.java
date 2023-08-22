package Buoi2;

import java.util.Scanner;

public class bai5_buoi2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Chanh: ");
        int x = s.nextInt();
        System.out.print("Tao: ");
        int y = s.nextInt();
        System.out.print("Le: ");
        int z = s.nextInt();

        int a,b,c;
        a = 1;
        b = 2 * a;
        c = 4 * a;
        if (b > y || c > z) {
            System.out.println("ko du nguyen lieu de nau mon si-ro");
        }
        if (b < y && c < z) {
            while (a <= x && b <= y && c <= z) {
                a++;
                b = 2 * a;
                c = 4 * a;
            }
        }
          //  while ( a > x || b > y || c > z);
        System.out.println("=> Tong so qua toi da: " + ((a+b+c)-7));
        System.out.println("(Chanh: "+(a-1)+", Tao: "+(b-2)+", Le: "+(c-4));
    }
    }

