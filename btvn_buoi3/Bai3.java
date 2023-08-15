package Buoi3;
import java.util.Scanner;
public class Bai3 {
    static void p(int n, int[] a) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }
        for (int i= 0; i <n; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = s.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = s.nextInt();
        }
        System.out.print("Mang da nhap: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        System.out.print("\nMang sap xep tang dan: ");
            p(n,a);

    }
}

