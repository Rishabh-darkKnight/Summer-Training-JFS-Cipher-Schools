import java.util.Scanner;

public class Activity_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Weight of Player in Pound :- ");
        float wt = sc.nextInt();
        float res = wt * (0.453592f);
        System.out.println("Weight of Player in Kg " + res);
    }
}
