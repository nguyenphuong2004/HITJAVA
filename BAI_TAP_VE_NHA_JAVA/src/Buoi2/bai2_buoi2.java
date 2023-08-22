package Buoi2;

import java.util.Scanner;

public class bai2_buoi2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        double S = 0;
        for (int i = 1; i <= n; i++){
           S = S + 1.0/i;
        }
        System.out.println("S= " + S);

        double P = 0;
        double Mu = 1;
        for (int i = 1; i <= n; i++){
            Mu *= i;
            P += Mu;
        }
        System.out.println("P= "+ P);
    }
}
