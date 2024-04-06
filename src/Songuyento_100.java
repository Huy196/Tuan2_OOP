public class Songuyento_100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 : ");
        int n = 99;
        int count = 0;
        int num =2;

        for (int i = 0; i < n; i++){
            boolean ĐK = true;
            for (int j = 2; j < num;j++){
                if (num % j == 0){
                    ĐK = false;
                    break;
                }
            }

            if (ĐK){
                System.out.print(num + " ");
                count++;
            }
            num ++;
        }
    }
}
