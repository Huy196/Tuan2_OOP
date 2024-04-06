import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        do {
            password = sc.nextLine();
        }while (!password.equals(("Vừng ơi mở ra")));
    }
}
