import java.util.Scanner;

public class Uocchung {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập a = ");
        a = sc.nextInt();

        System.out.print("Hãy nhập b = ");
        b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0 ){
            System.out.println("Không có ước chung ");
        }
        while (a != b){
            if(a > b){
                a = a - b;
                break;

            }else {
                b = b - a;
                break;

            }
        }
        System.out.println( "Ước chung lớn nhất của a, b : "  + a);


    }
}
