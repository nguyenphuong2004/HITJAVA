package Buoi4;

import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private String nhaXuatban;
    private String namXuatban;

    public Sach(){

    }
    public Sach(String maSach, String tenSach, String tacGia, String nhaXuatban, String namXuatban){
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.nhaXuatban = nhaXuatban;
        this.namXuatban = namXuatban;
    }
    public void setMaSach(){
        this.maSach = maSach;
    }
    public String getMaSach(){
        return maSach;
    }
    public void setTenSach(){
        this.tenSach = tenSach;
    }
    public String getTenSach(){
        return tenSach;
    }
    public void setTacGia(){
        this.tacGia = tacGia;
    }
    public String getTacGia(){
        return tacGia;
    }
    public void setNhaXuatban(){
        this.nhaXuatban = nhaXuatban;
    }
    public String getNhaXuatban(){
        return nhaXuatban;
    }
    public void setNamXuatban(){
        this.namXuatban = namXuatban;
    }
    public String getNamXuatban(){
        return namXuatban;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap phan tu mang: ");
        int n =s.nextInt();
        Sach[] sach = new Sach[n];

        for (int i= 0; i < n; i++){
            System.out.println("STT " + (i+1) +" : ");
            String maSach = s.nextLine();
            String tenSach = s.nextLine();
            String tacGia = s.nextLine();
            String nhaXuatban = s.nextLine();
            String namXuatban= s.nextLine();

            sach[i] = new Sach(maSach, tenSach,tacGia,nhaXuatban,namXuatban);
            s.nextLine();
        }
        System.out.println("Ma sach"+" "+"Ten sach"+" "+"Tac gia"+" "+"Nha xuat ban"+" "+"Nam xuat ban");
        for(Sach sach1 : sach){
            System.out.println(sach1.getMaSach()+" "+sach1.getTenSach()+" "+sach1.getTacGia()+" "+sach1.nhaXuatban+" "+ sach1.getNamXuatban());
        }
    }

}
