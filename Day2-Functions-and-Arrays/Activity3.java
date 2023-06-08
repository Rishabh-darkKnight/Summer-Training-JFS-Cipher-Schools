import java.util.Arrays;
import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        int sum = 0;
        for(int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println("Sum of all value is : " + sum);
        double mean = (double) sum / 6;
        System.out.println("Mean of all value is : " + mean);
        System.out.println("Median of array is : " + (arr[2]+arr[3])/2); // as 6 is given nor middle one
        System.out.println("Max element : " + arr[5]);
        System.out.println("Min element : " + arr[0]);

        double std = 0.0;
        for(int i = 0; i < 6; i++) {
            double res = (arr[i] - mean) * (arr[i] - mean);
            std += res;
        }
        System.out.println("Standard deviation is : " + Math.sqrt(std/6));
    }
}
