import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập số : ");

        int number = sc.nextInt();

        if (number < 2) {
            System.out.println(" Không phải là số nguyên tố !");
        }else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number % 2 == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println( number + " Là số nguyên tố");
            }else {
                System.out.println(number + " Không là số nguyên tố");
            }

        }
    }
}
