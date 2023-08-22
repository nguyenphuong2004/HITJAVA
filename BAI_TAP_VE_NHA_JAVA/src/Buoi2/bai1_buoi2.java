package Buoi2;

import java.util.Scanner;

public class bai1_buoi2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        for (int i = 1; i<= n; i++){
            System.out.print("*");
        }
        System.out.print("\n");
        int m = 0;

        do{
            System.out.print("*");
            for (int i = 1; i <n-1; i++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.print("\n");
            m++;
        }
        while (m != n-2);
        for (int i = 1; i<= n; i++) {
            System.out.print("*");
        }
    }
}
