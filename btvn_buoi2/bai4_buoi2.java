import java.util.Scanner;
import java.lang.Math;
public class bai4_buoi2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        double a = s.nextDouble();
        System.out.print("Nhap sp b: ");
        double b = s.nextDouble();
        System.out.print("Nhap so c: ");
        double c = s.nextDouble();
        double x3;// nghiem x3
        System.out.println("Pt: "+a+" .x^4 + "+b+" .x^2+ "+c+"=0");

        if (a==0){
            if (b==0){
                if (c==0)
                    System.out.println("Pt vo so nghiem");
                else{
                    System.out.println("Pt vo nghiem");
                }
            }
            else{
                if (-c/b < 0){
                    System.out.println("Pt vo nghiem");
                }
                else{
                    x3 = Math.sqrt(-c/b);
                    System.out.println("Pt co hai nghiem");
                    System.out.println("x1= "+x3);
                    System.out.println("x2= -"+x3);
                }

            }
        }
        else {
            double delta = b * b - 4 * a * c;
            double de;
            de = Math.sqrt(delta);
            double x1, x2;
            double x, d; // nghiem x va d

            if (delta < 0) {
                System.out.println("Pt vo nghiem");
            } else if (delta == 0) {

                x1 = -b / (2 * a);
                if (x1 < 0){
                    System.out.println("Pt vo nghiem");
                }
                else if (x1 == 0){
                    System.out.println("Pt co mot nghiem x = 0");
                }
                else{
                    System.out.println("Pt co hai nghiem");
                    x = Math.sqrt(x1);
                    System.out.println("x1= " + x);
                    System.out.println("x2= -" + x);
                }

            } else {
                x1 = (-b + de) / (2 * a);
                x2 = (-b - de) / (2 * a);
                if (x1 < 0 && x2 < 0){
                    System.out.println("Pt vo nghiem");
                }
                if (x1 == 0 && x2 >0){
                    System.out.println("Pt co ba nghiem: \n x1 = 0");
                    d = Math.sqrt(x2);
                    System.out.println("x1= " + Math.round(d*10000.0)/10000.0);
                    System.out.println("x2= -" + Math.round(d*10000.0)/10000.0);
                }
                if (x1 > 0 && x2 == 0){
                    System.out.println("Pt co ba nghiem: \n x1 = 0");
                    x = Math.sqrt(x1);
                    System.out.println("x1= " + Math.round(x*10000.0)/10000.0);
                    System.out.println("x2= -" + Math.round(x*10000.0)/10000.0);
                }
                if (x1 > 0 && x2 < 0){
                    System.out.println("Pt co hai nghiem");
                    x = Math.sqrt(x1);
                    System.out.println("x1= " + Math.round(x*10000.0)/10000.0);
                    System.out.println("x2= -" + Math.round(x*10000.0)/10000.0);
                }
                if (x1 < 0 && x2 > 0){
                    System.out.println("Pt co hai nghiem");
                    d = Math.sqrt(x2);
                    System.out.println("x1= " + Math.round(d*10000.0)/10000.0);
                    System.out.println("x2= -" + Math.round(d*10000.0)/10000.0);
                }
               if (x1 > 0 && x2 > 0){
                   System.out.println("Pt co 4 nghiem");
                   x = Math.sqrt(x1);
                   d = Math.sqrt(x2);
                   System.out.println("x1= " + Math.round(x*10000.0)/10000.0);
                   System.out.println("x2= -" + Math.round(x*10000.0)/10000.0);
                   System.out.println("x3= " + Math.round(d*10000.0)/10000.0);
                   System.out.println("x4= -" + Math.round(d*10000.0)/10000.0);
               }
            }
        }
    }
}
