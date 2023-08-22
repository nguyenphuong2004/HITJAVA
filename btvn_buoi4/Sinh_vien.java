package Buoi4;

import java.util.Scanner;

public class Sinh_vien {
    private String maSinhVien;
    private String hoTen;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    public Sinh_vien(){

    }
    public Sinh_vien(String maSinhVien,String hoTen, float diemHoa,float diemLy,float diemToan){
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemHoa = diemHoa;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
    }

    public void setMaSinhVien(){
        this.maSinhVien = maSinhVien;
    }
    public void setHoTen(){
        this.hoTen = hoTen;
    }
    public void setDiemToan(){
        this.diemToan = diemToan;
    }
    public void setDiemLy(){
        this.diemLy = diemLy;
    }
    public void setDiemHoa(){
        this.diemHoa = diemHoa;
    }

    public String getMaSinhVien(){
        return maSinhVien;
    }
    public String getHoTen(){
        return hoTen;
    }
    public float getDiemToan(){
        return diemToan;
    }
    public float getDiemLy(){
        return diemLy;
    }
    public float getDiemHoa(){
        return diemHoa;
    }





    public void nhap(){
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemHoa = diemHoa;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
    }
    public void xuat(){
        System.out.println("ma sinh vien: " + maSinhVien);
        System.out.println("ho ten: " + hoTen);
        System.out.println("diem hoa: " + diemHoa);
        System.out.println("diem ly: " + diemLy);
        System.out.println("diem toan: " + diemToan);
    }

    public float diemTB(){
        return (diemToan+diemHoa+diemLy)/3;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap so sinh vien: ");
        int n = s.nextInt();

        Sinh_vien[] sinh_viens = new Sinh_vien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1) + ": ");
            String maSinhVien = s.nextLine();
            String hoTen = s.nextLine();
            float diemToan = s.nextInt();
            float diemly = s.nextInt();
            float diemHoa = s.nextInt();
//            sinh_viens[i] = new Sinh_vien(maSinhVien,hoTen);
//            s.nextLine();
//        }
        }
        System.out.println("Ma sinh vien" + "   " + "Ho ten"+"   "+"Diem toan"+"   "+"Diem ly"+"   "+"Diem hoa"+"   ");
        for (Sinh_vien sinh_vien : sinh_viens){
            System.out.println(sinh_vien.getMaSinhVien()+" "+sinh_vien.getHoTen()+" "+sinh_vien.getDiemToan()+" "+sinh_vien.diemLy+" "+ sinh_vien.getDiemHoa());
        }
    }
}
