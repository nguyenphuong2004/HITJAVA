package Buoi3;


import java.util.Scanner;

public class Bai2 {
    static void Them1 (int n, int[] a, int k , int them) {
        for (int i = n ; i>=k ; i-- ){
            a[i] = a[i-1];
        }
        a[k] = them;
        n++;
        for (int i =0 ; i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
    static void Xoa1(int n, int []a, int k){
        int [] c = new int [n-1];

        for (int i = 0 ; i < n ; i++ ) {
            if ( i != (k -1 )) {
                c[i] = a[i];
            }
        }
        for (int i =0 ; i<n-1;i++){
            System.out.print(c[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap phan tu mang: ");
        int n =s.nextInt();
        System.out.print("Phan tu o vi tri xoa va them: ");
        int k = s.nextInt();
        System.out.print("Phan tu them: ");
        int them = s.nextInt();
        int [] a = new int [n+1];

         for (int i = 0; i < n; i++){
            System.out.print("a["+i+"]= ");
            a[i] = s.nextInt();
        }
        System.out.println("Mang da nhap: ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }

        int [] b = new int [n];
        for (int i =0 ; i < n; i++){
            b[i] = a[i];
        }

        System.out.println("\nMang sau khi them: ");
            Them1(n,a,k-1,them);

        System.out.println("\nMang sau khi xoa");
            Xoa1(n,b,k);
    }
}
