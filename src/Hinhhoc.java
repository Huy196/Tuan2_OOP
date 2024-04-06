import java.util.Scanner;

public class Hinhhoc {
    public static void main(String[] args) {
        int choi;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Hình chữ nhật");
        System.out.println("2. Hình vuông");
        System.out.println("3. Hình tam giác");
        System.out.println("0. Exit");
        System.out.println("Hãy nhập số bạn muốn :");
        choi = sc.nextInt();
            switch (choi){
                case 1:
                    for (int j = 2; j > 0; j--){
                        System.out.println();
                        for (int i = 0; i < 10; i++){
                            System.out.print("*");
                        }
                    }
                    break;
                case 2:
                    for (int j = 5; j > 0; j--){
                        System.out.println();
                        for (int i = 0; i < 5; i++){
                            System.out.print("*");
                        }
                    }
                    break;
                case 3:
                    for (int j = 5; j > 0; j--){
                        System.out.println();
                        for (int i = 0; i < j;i++){
                            System.out.print("*");
                        }
                    }
                    break;
                case 0 :
                    System.exit(0);
                default:
                    System.out.println("No có");
            }

        }

}
