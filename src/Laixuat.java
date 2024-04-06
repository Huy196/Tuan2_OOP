import java.util.Scanner;

public class Laixuat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hãy nhập số tiền muốn gửi : ");
        double money = sc.nextDouble();

        System.out.println("Hãy nhập số tháng gửi : ");
        double money2 = sc.nextDouble();

        System.out.println("Hãy nhập lãi xuất : ");
        double money3 = sc.nextDouble();

        double tong = 0;

        for (int i = 0 ; i < money2; i ++){
            tong += money * (money3 / 100)/12 * money2;
        }
        System.out.println("Số tiền lãi : " + tong);
    }
}
