import java.util.Scanner;
public class bai3_buoi2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = a.nextInt();
        if ( n == 1){
            System.out.println(n + " Ko la so nguyen to");
        }

        int sum = 0;
        for (int i = 2; i < n; i++){
            if (n%i==0) {
                sum++;
            }
        }
        if ( sum == 0){
            System.out.println(n + " La so nguyen to");
        }
        else{
            System.out.println(n + " Ko la so nguyen to");
        }
    }
}
