package Buoi4;

import java.util.Scanner;

public class Hinh_chu_nhat {
    private float D; // chieu dai
    private float R; // chieu rong
    public Hinh_chu_nhat(){

    }
    public Hinh_chu_nhat(float D, float R) {
        this.D = D;
        this.R = R;
    }

    public void setnhap(float D, float R){
        D = D;
        R = R;
    }
    public float getchuVi(){
        return  (D+R)*2;
    }

    public float getdienTich() {
        return D*R;
    }

    public static void main(String[] args) {
        Hinh_chu_nhat HCN = new Hinh_chu_nhat();
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        int dai =s.nextInt();
        System.out.print("Nhap chieu rong: ");
        int rong = s.nextInt();

        HCN.D = dai ;
        HCN.R = rong;
        System.out.println("Dien tich HCN: " + HCN.getdienTich());
        System.out.println("Chu vi HCN: "+ HCN.getchuVi());
    }

}
