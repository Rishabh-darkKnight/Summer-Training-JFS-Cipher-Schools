import java.util.Scanner;

public class Activity_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base pay : ");
        int bp = sc.nextInt();
        double hra = 0;
        double da = 0;
        if(bp > 5000) {
            hra = (12 * bp) / 100;
            da = (14 * bp) / 100;
        }
        else{
            hra = (16 * bp) / 100;
            da = (18 * bp) / 100;
        }
        double gp = (bp + hra + da);
        System.out.println(Math.round(gp));
    }
}
