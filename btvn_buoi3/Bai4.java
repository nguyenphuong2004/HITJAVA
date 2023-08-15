package Buoi3;
import java.util.Scanner;
public class Bai4 {
    static void KtraDx(String a) {
        int index = 0;
        int dem = 0;
        double sl = Math.floor(a.length() / 2);
        for (int i = (a.length() - 1); i >= sl; i--) {
            if (a.charAt(i) == (a.charAt(index))) {
                dem++;
            }
            index++;
        }
        if (a.length() % 2 != 0) {
            dem--;
        }
        if (dem == sl) {
            System.out.println("True.");
        } else {
            System.out.println("False.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String a = sc.nextLine();
        KtraDx(a);
    }
}
