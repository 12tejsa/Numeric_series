import java.util.Scanner;
public class decimal_toBinary {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int decemal_num = sc.nextInt();

        int ans = 0;
        int pw=1;

        while(decemal_num >0){
            int parity = decemal_num % 2;
            ans += (parity * pw);
            pw *= 10;
            decemal_num /= 2;
        }
        System.out.println(ans);
    }
}
