public class Songuyento1 {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên : ");
        int n = 70;
        int count = 0;
        int num = 2;

        for (int i = 0 ; i < n ; i++){
            boolean huy = true;
            for (int j = 2; j < num ; j++){
                if (num % j ==0){
                    huy = false;
                    break;
                }
            }
            if(huy){
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
